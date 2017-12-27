package com.ct.utilities;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
//import javax.mail.*;
//import javax.mail.internet.*;
//import javax.mail.BodyPart;

public class EmailStatus {
	public static void sendEmail(String toEmail, String fromEmail, String reportName) throws Exception {
		// host name or ip address
		String host = "smtp.gmail.com";

		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.host", host);
//		javax.mail.Session session = javax.mail.Session.getDefaultInstance(properties);
//
//		// compose the message
//		try {
//			MimeMessage message = new MimeMessage(session);
//			message.setFrom(new InternetAddress(fromEmail));
//			message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
//			message.setSubject(EmailConfig.subject);
//
//			// we need body
//			BodyPart body = new MimeBodyPart();
//
//			// set text
//			body.setContent(EmailConfig.messageBody, "text/html");
//
//			// create an attachment
//			BodyPart attachment = new MimeBodyPart();
//			DataSource source = new FileDataSource(reportName);
//			attachment.setDataHandler(new DataHandler(source));
//			attachment.setFileName(EmailConfig.attachmentName);
//
//			MimeMultipart multipart = new MimeMultipart();
//			multipart.addBodyPart(body);
//			multipart.addBodyPart(attachment);
//			message.setContent(multipart);
//
//			// Send the message
//			Transport.send(message);
//		} catch (MessagingException m) {
//			m.printStackTrace();
//		}

	}
}
