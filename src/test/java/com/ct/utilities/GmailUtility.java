package com.ct.utilities;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.repackaged.org.apache.commons.codec.binary.Base64;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;

import com.google.api.services.gmail.GmailScopes;
import com.google.api.services.gmail.model.*;

import com.google.api.services.gmail.Gmail;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GmailUtility {
	/** Application name. */
    private static final String APPLICATION_NAME =
        "Gmail API Java Quickstart";

    /** Directory to store user credentials for this application. */
    private static final java.io.File DATA_STORE_DIR = new java.io.File(
        System.getProperty("user.home"), ".credentials/gmail-java-loanct");

    /** Global instance of the {@link FileDataStoreFactory}. */
    private static FileDataStoreFactory DATA_STORE_FACTORY;

    /** Global instance of the JSON factory. */
    private static final JsonFactory JSON_FACTORY =
        JacksonFactory.getDefaultInstance();

    /** Global instance of the HTTP transport. */
    private static HttpTransport HTTP_TRANSPORT;

    /** Global instance of the scopes required by this quickstart.
     *
     * If modifying these scopes, delete your previously saved credentials
     * at ~/.credentials/gmail-java-quickstart
     */
    private static final List<String> SCOPES =
        Arrays.asList(GmailScopes.GMAIL_READONLY);
    

    static {
        try {
            HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
            DATA_STORE_FACTORY = new FileDataStoreFactory(DATA_STORE_DIR);
        } catch (Throwable t) {
            t.printStackTrace();
            System.exit(1);
        }
    }

    /**
     * Creates an authorized Credential object.
     * @return an authorized Credential object.
     * @throws IOException
     */
    public static Credential authorize() throws IOException {
        // Load client secrets.
        InputStream in =
        		GmailUtility.class.getResourceAsStream("/client_secret.json");
        GoogleClientSecrets clientSecrets =
            GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        // Build flow and trigger user authorization request.
        GoogleAuthorizationCodeFlow flow =
                new GoogleAuthorizationCodeFlow.Builder(
                        HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(DATA_STORE_FACTORY)
                .setAccessType("offline")
                .build();
        Credential credential = new AuthorizationCodeInstalledApp(
            flow, new LocalServerReceiver()).authorize("user");
        System.out.println(
                "Credentials saved to " + DATA_STORE_DIR.getAbsolutePath());
        return credential;
    }

    /**
     * Build and return an authorized Gmail client service.
     * @return an authorized Gmail client service
     * @throws IOException
     */
    public static Gmail getGmailService() throws IOException {
        Credential credential = authorize();
        return new Gmail.Builder(HTTP_TRANSPORT, JSON_FACTORY, credential)
                .setApplicationName(APPLICATION_NAME)
                .build();
    }
    
    public static List<Message> listMessagesMatchingQuery(Gmail service, String userId,
    	      String query) throws IOException {
    	    ListMessagesResponse response = service.users().messages().list(userId).setQ(query).execute();

    	    List<Message> messages = new ArrayList<Message>();
    	    while (response.getMessages() != null) {
    	      messages.addAll(response.getMessages());
    	      if (response.getNextPageToken() != null) {
    	        String pageToken = response.getNextPageToken();
    	        response = service.users().messages().list(userId).setQ(query)
    	            .setPageToken(pageToken).execute();
    	      } else {
    	        break;
    	      }
    	    }

//    	    for (Message message : messages) {
//    	      //System.out.println(message.values()); //.toPrettyString());
//    	      
//    	      Message messageDetail = service.users().messages().get(userId, message.getId()).execute();
//
//    	      System.out.println(messageDetail.getSnippet());
//    	      
//    	      getAttachments(service,"me",message.getId());
//
//    	    }
    	   
    	   
    	    return messages;
    	  }
    
    public static String getMessage(Gmail service, String userId, String messageId)
    	      throws IOException {
    	    Message message = service.users().messages().get(userId, messageId).execute();

    	  //  System.out.println("Message snippet: " + message.getSnippet());
    	    
//    	    MessagePart part = message.getPayload();
//    	    System.out.println(Base64.decodeBase64(part.getBody().getData()));

    	    return message.getSnippet();
    	  }

    
    public static void getAttachments(Gmail service, String userId, String messageId)
    	      throws IOException {
    	    Message message = service.users().messages().get(userId, messageId).execute();
    	    List<MessagePart> parts = message.getPayload().getParts();
    	    for (MessagePart part : parts) {
    	      if (part.getFilename() != null && part.getFilename().length() > 0) {
    	        String filename = part.getFilename();
    	        String attId = part.getBody().getAttachmentId();
    	        MessagePartBody attachPart = service.users().messages().attachments().
    	            get(userId, messageId, attId).execute();

    	        byte[] fileByteArray = Base64.decodeBase64(attachPart.getData());
    	        FileOutputStream fileOutFile =
    	            new FileOutputStream("" + filename);
    	        fileOutFile.write(fileByteArray);
    	        fileOutFile.close();
    	      }
    	    }
    	    }
    	    

}
