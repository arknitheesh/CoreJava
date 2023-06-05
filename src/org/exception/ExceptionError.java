package org.exception;

public class ExceptionError {

	public static void main(String[] args) {
		
		try {
			int i = 2;
			int j = 2;
			int f = i+j/i/i/j;
			System.out.println(f);
		} catch (ArithmeticException e) {
			// TODO: handle exception
		}

	}

}
