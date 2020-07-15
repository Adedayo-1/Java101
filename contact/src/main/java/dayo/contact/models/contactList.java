package dayo.contact.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class contactList {
	private List<Contacts>contactTable;

	
	
	public contactList() {
		contactTable = new ArrayList<>();
	}//Creating list
	 public void listContact ( Contacts contactTable) {
		 if ( contactTable !=null) {
			 this.contactTable.add(contactTable);
		 } else {
			 this.contactTable = new ArrayList<>();
			 this.contactTable.add(contactTable);
		 }
	 }//Creating an instance of contact
	 public Contacts contactDetails() {
		    Contacts b = new Contacts();
			System.out.println( "Please enter the name of the contact you would like to add :" );
			Scanner details = new Scanner(System.in);
	        b.setName(details.nextLine());
	        System.out.println( "Please enter the phone number of the contact you would like to add :" );
	        Scanner number = new Scanner(System.in);
	        b.setNumber(number.nextLine());
	        String nName = b.getName();
	        String nNumber = b.getNumber();
	        	      for (Contacts contacts:contactTable) {
	        	    	  String eName = contacts.getName();
	        		        String eNum = contacts.getNumber();
	        	if (nName.equalsIgnoreCase(eName) || nNumber.equalsIgnoreCase(eNum)) {
	        		System.out.println("Sorry this contact already exists.");
	        		        	}
	        }
	        
	return b;
}
	 public void printContact() {
		 for (int i=0; contactTable.size() > i ; i++) {
			 System.out.println(contactTable.get(i).printCon()); 
		 }
	 }
	 public void search() {
		 System.out.println( "Please enter the name of the contact you would like to search for :" );
	     Scanner search = new Scanner(System.in);
	     String result = search.nextLine();
		 for (Contacts c:contactTable) {
			 if (c.getName().equalsIgnoreCase(result)) {
				 System.out.println( c.printCon());
			 }
		 }
	 }
	 public void modify() {
		 System.out.println( "Please enter the name of the contact you would like to modify  :" );
	     Scanner modify = new Scanner(System.in);
	     String result1 = modify.nextLine();
		 for (Contacts c:contactTable) {
			 if (c.getName().equalsIgnoreCase(result1)) {
				 System.out.println( "Please enter the new name of the contact");
				 Scanner modify1 = new Scanner(System.in);
			     String result11 = modify1.nextLine();
				 c.setName(result11);
				 System.out.println( c.printCon());
			 }
		 }
	 }
	 public void delete() {System.out.println( "Please enter the name of the contact you would like to delete :" );
     Scanner deleted = new Scanner(System.in);
     String result2 = deleted.nextLine();
	 for (int i = 0; contactTable.size() > i; i++) {
		 if (contactTable.get(i).getName().equalsIgnoreCase(result2)) {
			 contactTable.remove(i);
			 
		 }
		 
	 }
	 }
}
