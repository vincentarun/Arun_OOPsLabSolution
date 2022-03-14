package com.greatlearning.services;


import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {

	public char[] generatePassword() {

		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";

		String values = capitalLetters + smallLetters + numbers + specialCharacters;

		Random random = new Random();

		char[] password = new char[8];

	
		for (int i = 0; i < 8; i++) {
			
			password[i] = values.charAt(random.nextInt(values.length()));

		}
		return password;
	}
}
	
		
	

