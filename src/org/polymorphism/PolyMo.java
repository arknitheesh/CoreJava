package org.polymorphism;

public class PolyMo extends Calss1 {

	//Same Method Name in All Class
	public void UserName() {
		System.out.println("Nitheesh : ");

	}
	
	public static void main(String[] args) {
		PolyMo po = new PolyMo();
		Calss1 cl = new Calss1();
		Class2 c2 = new Class2();
		
		po.UserName();
		cl.UserName();
		c2.UserName();

	}

}
