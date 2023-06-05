package org.scanner;

import java.util.Scanner;

//class
public class Scans {
	
	static //Declare Scanner as global variable
	Scanner scn;
	
	//Main Method
	public static void main(String[] args) {
		
		
		scn = new Scanner(System.in);
		
		//User Name get in User Inputs
		
		System.out.println("Enter User Name : ");
		String username = scn.next();
		System.out.println(" User Name is : " + username);

	}

}
