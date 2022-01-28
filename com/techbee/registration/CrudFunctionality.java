package com.techbee.registration;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudFunctionality {

	ArrayList<Customer> customerDatabase = new ArrayList<>();
	Scanner in = new Scanner(System.in);
	
	//Create Method
	public void addCustomer(Customer customer) {
		customerDatabase.add(customer);
		System.out.println(customer.getFirstName() + " is added successfully!!");
	}
	
	//Read Method
	public void getAllCustomers() {
		for(Customer cust : customerDatabase) {
			System.out.println("************************************");
			System.out.println("Firstname - " + cust.getFirstName());
			System.out.println("Lastname - " + cust.getLastName());
			System.out.println("Email - " + cust.getEmailAdress());
			System.out.println("Age - " + cust.getAge());
			System.out.println("UserName - " + cust.getUserName());
			System.out.println("Phone Number - " + cust.getPhoneNumber());
			System.out.println("************************************");
			System.out.println();

		}
		
	}
	//Read Method by Given First Name
	public void getACustomer(String firsName) {
		for(Customer cust : customerDatabase) {
			if (cust.getFirstName().equals(firsName))
			{
			System.out.println("************************************");
			System.out.println("Firstname - " + cust.getFirstName());
			System.out.println("Lastname - " + cust.getLastName());
			System.out.println("Email - " + cust.getEmailAdress());
			System.out.println("Age - " + cust.getAge());
			System.out.println("UserName - " + cust.getUserName());
			System.out.println("Phone Number - " + cust.getPhoneNumber());
			System.out.println("************************************");
			System.out.println();
			break;
			} else
				 System.out.print("please enter a valid first name: ");

		}
		
	}
	
	//Delete Method by Given First Name
	public void deleteACustomer(String firstname) {
		for(Customer cust : customerDatabase) {
			if(cust.getFirstName().equals(firstname)) {
				customerDatabase.remove(cust);
			    System.out.println(firstname+".. is removed succesfully!!");
			    break;
			}else
				 System.out.print("please enter a valid first name: ");
		}
		
	}
	
	
	//Update Method by Given First Name
	public void updateACustomer(String firstname) {
     
        System.out.print("please enter your new  email: ");
        String newEmail = in.nextLine();
        System.out.print("please enter your new  userName: ");
        String newUserName = in.nextLine();
        System.out.print("please enter your new phone number: ");
        long newPhone = in.nextLong();
      
		for(Customer cust : customerDatabase) {
			if(cust.getFirstName().equals(firstname)) {
			
		//		
				cust.setUserName(newUserName);
				cust.setEmailAdress(newEmail);
				cust.setPhoneNumber(newPhone);
			
				System.out.println("Your new details are updated succesfully!! "+cust);
				break;
			}else
				 System.out.print("please enter a valid first name: ");
		}
		
	}
	
}
