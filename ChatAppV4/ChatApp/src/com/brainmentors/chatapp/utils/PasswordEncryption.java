package com.brainmentors.chatapp.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public interface PasswordEncryption {
	
	public static String passwordEncrypt(String plainPassword) throws NoSuchAlgorithmException {
		String encryptedPassword = null;
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(plainPassword.getBytes());
		byte []encrypt = md.digest();
		
		StringBuffer sb = new StringBuffer();
		for(byte b : encrypt) {
			sb.append(b);
		}
		encryptedPassword = sb.toString();
//		System.out.println("Encrytped Password : " + sb.toString());
		return encryptedPassword;
	}

}
