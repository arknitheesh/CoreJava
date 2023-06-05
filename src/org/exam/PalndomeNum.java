package org.exam;

public class PalndomeNum {

	public static void main(String[] args) {

		int r;
		int sum =0;
		int n = 121;
		int temp = n;
		
		while (n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;			
		}
		
		if (temp==sum) {
			System.out.println("Palindome Number");
		} else {
			System.out.println("Not Palindome Number");
		}
	}

}
