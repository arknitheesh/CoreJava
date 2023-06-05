package org.ClassMethodOblect;

//Class
public class MethodObject {

	//Method 
	//String Data Type
	private void internName() {
		System.out.println("Nitheesh");

	}
	//String Data Type
	private void internId() {
		System.out.println("INT007");

	}
	
	//Long Data type
	private void internMob() {
		System.out.println(7034271727l);

	}
	//String Data Type
	private void intenEmail() {
		System.out.println("nitheeshkn47@gmail.com");

	}
	
	
	
	//Main Method
	public static void main(String[] args) {
	
		// call private method
		MethodObject mo = new MethodObject();
		
		mo.internName();
		mo.internId();
		mo.internMob();
		mo.intenEmail();

	}

}
