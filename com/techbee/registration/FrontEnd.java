package com.techbee.registration;

import java.util.Scanner;

public class FrontEnd {

	public static void main(String[] args) {
		
		Customer user1= new Customer("hass", "elh", 929334812 , "kjkjjjss@ll.com", "elhakjkjkjkjkjkkkk", 33);
		Customer user2= new Customer("lkl", "lo", 929334812 , "kjkjjjss@ll.com", "elhakjkjkjkjkjkkkk", 54);
		Customer user3= new Customer("uu", "kk", 552478523 , "kjkjjyss@ll.com", "elhakjkjkjkjkjkkkk", 20);
		Customer user4= new Customer("kk", "kj", 929300033 , "kjkjjjss@ll.com", "elhakjkjkjkjkjkkkk", 66);

		  
		Scanner in = new Scanner(System.in);
  
	 
	CrudFunctionality  crud = new  CrudFunctionality();
		 
	//Add Customers
	 crud.addCustomer(user1);
	 crud.addCustomer(user2);
	 crud.addCustomer(user3);
	 crud.addCustomer(user4);
    // View All Customers
	 crud.getAllCustomers();
	
	 //View a Customer by First Name
	 System.out.print("please enter your  first name to view all your Data: ");
     String nameView = in.nextLine();
	 crud.getACustomer(nameView);;
	 
	//Delete a Customer by First Name
	 System.out.print("please enter your  first name to delete your Data: ");
     String nameToDelete = in.nextLine();
	 crud.deleteACustomer(nameToDelete);
	 
	//Update a Customer by First Name
	 System.out.print("please enter your first name to Update your Data: ");
     String nameToUpdate = in.nextLine();
	 crud.updateACustomer(nameToUpdate);
	 
	 //View the list after action taken
	 crud.getAllCustomers();

	}

}
