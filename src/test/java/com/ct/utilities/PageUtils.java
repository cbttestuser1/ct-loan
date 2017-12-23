package com.ct.utilities;

public class PageUtils {
	
	
	
	public static String getId(String str){
        String[] words = str.split(" ");
        String id = words[5].substring(0, 5);
        return id;
	}
	
	public static void main(String[] args) {
		String mes = "Your loan application ID is 20039. You will receive confirmation email with your application detail.";
		
		System.out.println(getId(mes));
		
	}

}
