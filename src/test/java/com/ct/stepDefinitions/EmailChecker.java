package com.ct.stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.MimeBodyPart;

import org.apache.commons.lang3.StringUtils;

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

	public static String downloadAttachment() throws MessagingException {

		String saveDirectory = "./attachments";
		String fileName = "";
		
		getConnection();
		try {
			for (int i = 0; i < messages.length; i++) {
				Message message = messages[i];
				Address[] fromAddress = message.getFrom();
				String from = fromAddress[0].toString();
				String subject = message.getSubject();
				String sentDate = message.getSentDate().toString();

				String contentType = message.getContentType();
				String messageContent = "";

				// store attachment file name, separated by comma
				String attachFiles = "";

				if (contentType.contains("multipart")) {
					// content may contain attachments
					Multipart multiPart = (Multipart) message.getContent();
					int numberOfParts = multiPart.getCount();
					for (int partCount = 0; partCount < numberOfParts; partCount++) {
						MimeBodyPart part = (MimeBodyPart) multiPart.getBodyPart(partCount);
						if (Part.ATTACHMENT.equalsIgnoreCase(part.getDisposition())) {
							// this part is attachment
							fileName = part.getFileName();
							System.out.println("Email has attatchment is " + fileName);
							attachFiles += fileName + ", ";
							part.saveFile(saveDirectory + File.separator + fileName);
						} else {
							// this part may be the message content
							messageContent = part.getContent().toString();
						}
					}

					if (attachFiles.length() > 1) {
						attachFiles = attachFiles.substring(0, attachFiles.length() - 2);
					}
				} else if (contentType.contains("text/plain") || contentType.contains("text/html")) {
					Object content = message.getContent();
					if (content != null) {
						messageContent = content.toString();
					}
				}

				// print out details of each message
				System.out.println("Message #" + (i + 1) + ":");
				System.out.println("\t From: " + from);
				System.out.println("\t Subject: " + subject);
				System.out.println("\t Sent Date: " + sentDate);
				System.out.println("\t Message: " + messageContent);
				System.out.println("\t Attachments: " + attachFiles);
			}

		} catch (NoSuchProviderException ex) {
			System.out.println("No provider for pop3.");
			ex.printStackTrace();
		} catch (MessagingException ex) {
			System.out.println("Could not connect to the message store");
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		closeConnection();
		
		return fileName;
	}

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

	public static void closeConnection() throws MessagingException {
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
