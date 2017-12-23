package com.ct.stepDefinitions;

import java.io.IOException;
import java.util.*;
import javax.mail.*;

public class EmailChecker {

	private static final String host = "pop.gmail.com";// change accordingly
	private static final String mailStoreType = "pop3";
	private static final String username = " testemailforcloan@gmail.com";// put
																			// your
																			// email
																			// here
	private static final String password = "testemail";// Password here

	private static Message[] messages;
	private static Folder emailFolder;
	private static Store store;

	public static void getConnection() {
		try {

			// create properties field
			Properties properties = new Properties();

			properties.put("mail.pop3.host", host);
			properties.put("mail.pop3.port", "995");
			properties.put("mail.pop3.starttls.enable", "true");

			Session emailSession = Session.getDefaultInstance(properties);

			// create the POP3 store object and connect with the pop server
			store = emailSession.getStore("pop3s");

			store.connect(host, username, password);

			// create the folder object and open it
			emailFolder = store.getFolder("Inbox");

			emailFolder.open(Folder.READ_ONLY);

			// retrieve the messages from the folder in an array and print it
			messages = emailFolder.getMessages();
			System.out.println("messages.length---" + messages.length);

			// for (int i = 0, n = messages.length; i < n; i++) {
			// Message message = messages[i];
			//
			// Object obj = message.getContent();
			// Multipart mp = (Multipart) obj;
			// BodyPart bp = mp.getBodyPart(0);
			//
			// System.out.println("---------------------------------");
			// System.out.println("Email Number " + (i + 1));
			// System.out.println("Subject: " + message.getSubject());
			// System.out.println("From: " + message.getFrom()[0]);
			// System.out.println("To: " +
			// message.getAllRecipients().toString());
			// System.out.println("Received Date:" + message.getReceivedDate());
			// System.out.println("Text: " + bp.getContent().toString());
			// }

			// close the store and folder objects
			// emailFolder.close(false);
			// store.close();

		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void closeConnection() throws MessagingException{
		 emailFolder.close(false);
					 store.close();
	}

	public static String massageText() throws IOException, MessagingException {
		String body = "";
		getConnection();
		for (int i = 0, n = messages.length; i < n; i++) {
			Message message = messages[i];

			Object obj = message.getContent();
			Multipart mp = (Multipart) obj;
			BodyPart bp = mp.getBodyPart(0);

			// System.out.println("---------------------------------");
			// System.out.println("Email Number " + (i + 1));
			System.out.println("Subject: " + message.getSubject());
			// System.out.println("From: " + message.getFrom()[0]);
			// System.out.println("To: " +
			// message.getAllRecipients().toString());
			// System.out.println("Received Date:" + message.getReceivedDate());
			System.out.println("Text: " + bp.getContent().toString());
			body = bp.getContent().toString();
		}
		closeConnection();

		return body;
	}
}
