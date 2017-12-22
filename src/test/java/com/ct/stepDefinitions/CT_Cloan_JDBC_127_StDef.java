package com.ct.stepDefinitions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;




public class CT_Cloan_JDBC_127_StDef {
	
	private String url="jdbc:oracle:thin:@ec2-54-244-62-153.us-west-2.compute.amazonaws.com:1521:xe";
	private String name="ctlqa";
	private String password="ctl987";
	
	
	Connection connection=null;
	Statement statement=null;
	ResultSet result=null;
	
	@Test
	
	
	public void setUP() throws Exception{
		
		String ssnStr="890898976" ;
		connection=DriverManager.getConnection(url, name, password);
		statement=connection.createStatement();
		result=statement.executeQuery("select first_name, last_name, middle_init, to_char(date_of_birth,'dd-MON-yyyy') as date_of_birth"
				+ " , gender, ssn_nr from ctldev.person where SSN_NR="+ssnStr);
			
		List<String> column=new ArrayList<>();
		column.add("FIRST_NAME");
		column.add("LAST_NAME");
		column.add("MIDDLE_INIT");
		column.add("DATE_OF_BIRTH");
		column.add("GENDER");
		column.add("SSN_NR"); 
		while(result.next()){
			for(String a:column){
			System.out.println(result.getString(a));
		}
		
	}
	}
}