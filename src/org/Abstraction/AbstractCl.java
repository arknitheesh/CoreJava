package org.Abstraction;

abstract class AbstractCl {

	//Abstract class have no body
	public abstract void userName();
	
	
	
	public static void main(String[] args) {
		//Call Abstract Method
		AbstractCl abs = new AbstractCl() {
			
			@Override
			public void userName() {
				System.out.println("User Name is : ");
				
			}
		};
		
		abs.userName();
	}
	
	
	
}
