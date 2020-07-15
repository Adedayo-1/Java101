package dayo.contact.models;

import java.util.Scanner;

public class Contacts {
	String number;
	String name;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public  String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	public String printCon() {
	return "|"+ this.name+"       "+ this.number+"|";
	}
}


