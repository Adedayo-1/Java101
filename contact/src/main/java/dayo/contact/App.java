package dayo.contact;

import java.util.Scanner;

import dayo.contact.models.contactList;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        contactList  n = new contactList();
        //passing the result(created contact) into the list
    while  (true) {n.listContact(n.contactDetails());
    System.out.println( "Do you want to add another contact?" );
	Scanner answer = new Scanner(System.in);
	String ans = answer.nextLine();
	if(ans.trim().equalsIgnoreCase("yes")) {continue;
	}
	else  {
    
		break;
	
	}
    }//Features
    //n.printContact();
    //n.search();
   // n.modify();
  // n.delete();
   n.printContact();
    }
}
