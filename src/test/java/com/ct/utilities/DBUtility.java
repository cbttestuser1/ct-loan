package com.ct.utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtility {
	private static String URL = "jdbc:mysql://localhost:3306/hr";
	private static String DbUserName = "root";
	private static String DbPassword = "root";

	private static String oraURL = "jdbc:oracle:thin:@ec2-54-244-62-153.us-west-2.compute.amazonaws.com";
	private static String oraDbUserName = "ctlqa";
	private static String oraDbPassword = "ctl987";

	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;

	public enum DBType {
		MYSQL, ORACLE, SYBASE
	}

	public static Connection getConnection(DBType dbType) throws SQLException {

		switch (dbType) {
		case ORACLE:
			return DriverManager.getConnection(oraURL, oraDbUserName, oraDbPassword);

		case MYSQL:
			return DriverManager.getConnection(URL, DbUserName, DbPassword);

		default:
			return null;
		}
	}

	public static void establishConnection(DBType dbType) throws SQLException {

		switch (dbType) {
		case ORACLE:
			connection = DriverManager.getConnection(oraURL, oraDbUserName, oraDbPassword);
			break;
		case MYSQL:
			connection = DriverManager.getConnection(URL, DbUserName, DbPassword);
			break;
		default:
			throw new RuntimeException("Invalid DBType " + dbType);
		}
	}

	public static List<String[]> runSQLQuery(String sql) {
		List<String[]> queryResult = new ArrayList<>();

		try {
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			resultSet = statement.executeQuery(sql);
			ResultSetMetaData rsMetada = resultSet.getMetaData();

			int columnsCount = rsMetada.getColumnCount();
			resultSet.last();
			int recordCount = resultSet.getRow();

			if (columnsCount == 0 || recordCount == 0) {
				return null;
			}

			resultSet.beforeFirst();

			while (resultSet.next()) {
				String[] cellData = new String[columnsCount];

				for (int cell = 1; cell <= columnsCount; cell++) {
					cellData[cell - 1] = resultSet.getString(cell);

				}
				queryResult.add(cellData);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return queryResult;

	}

	public static void closeConnections() {
		try {

			if (resultSet != null) {
				resultSet.close();
			}
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
