package org.exam;

import java.util.Iterator;

public class StringReverse {

	public static void main(String[] args) {

		String str = "Tester Admin" , newstr = "";
		char rev ;
				
		for (int i = 0; i <str.length(); i++) {
			rev = str.charAt(i);
			newstr = rev+newstr;
		}
		System.out.println(newstr);
	}

}
