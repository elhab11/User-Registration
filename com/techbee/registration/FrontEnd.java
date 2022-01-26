package com.techbee.registration;

import java.util.Scanner;

public class FrontEnd {

	public static void main(String[] args) {
		
		Registration user= new Registration();
		 Scanner in = new Scanner(System.in);
		 
	        System.out.print("please enter your first name: ");
	        String firsNmae = in.nextLine();
	        user.setFirstName(firsNmae);
	        
	        System.out.print("please enter your last name: ");
	        String lastName = in.nextLine();
	        user.setLastName(lastName);
	        
	        System.out.print("please enter your phone number: ");
	        Long phonNumber = in.nextLong();
	        user.setPhoneNumber(phonNumber);
	        
	        System.out.print("please enter your Email adress: ");
	        String emailAdress = in.nextLine();
	        user.setEmailAdress(emailAdress);
	        
	        System.out.print("please enter your Username: ");
	        String UserName = in.nextLine();
	        user.setUserName(UserName);
	        
	        System.out.print("please enter your age: ");
	        int age = in.nextInt();
	        user.setAge(age);

	}

}
