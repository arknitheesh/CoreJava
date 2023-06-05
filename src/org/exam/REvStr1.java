package org.exam;

public class REvStr1 {

	public static void main(String[] args) {

		String data = "omo", news="";
		String rev = data;
		
		char ch;
		//int i=0; i<data.length();i++
		for (int i=0; i<data.length();i++) {
			ch =data.charAt(i);
			news =ch+news;
		}
		System.out.println(news);
		
		
		if (news.equals(rev)) {
			System.out.println("Palindrome String");
		} else {
			System.out.println(" Not Palindrome String");
		}
	}

}
