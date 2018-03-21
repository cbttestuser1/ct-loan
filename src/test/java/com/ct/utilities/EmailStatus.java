package com.ct.utilities;

import java.util.Properties;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EmailStatus {
	public static void sendEmail(String toEmail, String fromEmail, String reportName) throws Exception {
		// host name or ip address
		String host = "smtp.gmail.com";
		// get session object
		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.host", host);
		javax.mail.Session session = javax.mail.Session.getDefaultInstance(properties);

		// compose the message
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(fromEmail));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			message.setSubject(EmailConfig.subject);

			// we need body
			BodyPart body = new MimeBodyPart();

			// set text
			body.setContent(EmailConfig.messageBody, "text/html");

			// create an attachment
			BodyPart attachment = new MimeBodyPart();
			DataSource source = new FileDataSource(reportName);
			attachment.setDataHandler(new DataHandler(source));
			attachment.setFileName(EmailConfig.attachmentName);

			MimeMultipart multipart = new MimeMultipart();
			multipart.addBodyPart(body);
			multipart.addBodyPart(attachment);
			message.setContent(multipart);

			// Send the message
			Transport.send(message);
		} catch (MessagingException m) {
			m.printStackTrace();
		}

	}

	private Properties properties = null;

	private void init() {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "465");
		props.put("mail.smtp.auth", "false");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		javax.mail.Session.getDefaultInstance(properties);

	}

	public void sendEmail(String env, Properties props) {
		this.properties = props;
		init();
	}

}
