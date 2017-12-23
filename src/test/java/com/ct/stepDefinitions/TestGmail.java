package com.ct.stepDefinitions;

import java.io.IOException;
import java.util.List;


import com.ct.utilities.GmailUtility;
import com.google.api.services.gmail.Gmail;
import com.google.api.services.gmail.model.Message;

public class TestGmail {
    public static void main(String[] args) throws IOException {
    	
		Gmail service = GmailUtility.getGmailService();
		List<Message> messages = GmailUtility.listMessagesMatchingQuery(service,"me","from:training@cybertekschool.com");
		String messageId=messages.get(0).getId();
		//System.out.println(GmailUtility.getMessage(service, "me", messageId));
		//GmailUtility.getAttachments(service,"me",messageId);
		System.out.println(GmailUtility.getAttachmentName(service,"me",messageId));


	}
}
