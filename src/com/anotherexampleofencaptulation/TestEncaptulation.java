package com.anotherexampleofencaptulation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestEncaptulation {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);

		Account accountDetails= new Account();

		System.out.println("********BANK OF BANK********");
		
		System.out.println("Enter The Account Holder Name :");
		String nameString = scanner.next();
		accountDetails.setName(nameString);
		
		System.out.println("Welcome "+nameString);
		
		System.out.println("Enter The Account Number :");
		long accountNumberLong = scanner.nextLong();
		accountDetails.setAccountNunmber(accountNumberLong);
		
		//		System.out.println("Enter The Password");
		//		long password = scanner.nextLong();

		System.out.println("Enter The Account Holder Email :");
		String emailString = scanner.next();
		accountDetails.setEmail(emailString);

		System.out.println("Enter The Valid Amount :");
		float amountFloat = scanner.nextFloat();
		accountDetails.setAmount(amountFloat);
		System.out.println("Enter 1 Verify Bank Detail");
		System.out.println("Enter 2 cancel");
		int verify = scanner.nextInt();
		if (verify==1) {
			System.out.println(accountDetails.getAccountNunmber());
			System.out.println(accountDetails.getName());
			System.out.println(accountDetails.getEmail());
			System.out.println(accountDetails.getAmount());
		} else if (verify==2) {
			System.out.println("**Thank You**");
			System.out.println("Don't Share Password and Account Details");
		}
	}	
}
