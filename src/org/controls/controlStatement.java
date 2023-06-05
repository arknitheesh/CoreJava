package org.controls;

public class controlStatement {

	public static void main(String[] args) {
		
		//Statement 1
		for (int i =1; i<=100; i++) {
			System.out.println(i);
			
		}
		
		//Statement 2 Break
		for (int i = 0; i < 10; i++) {
			
			if (i==5) {
				break;
			}
			System.out.println(i);
		}
		
		
		//Statement 3 continue
		for (int i = 0; i < 10; i++) {
			
			if (i==5) {
				continue;
			}
			System.out.println(i);
		}
		
		
		//Statement 4 
		for (int i = 0; i < 1; i++) {
			
			for (int j = 0; j < 3; j++) {
				System.out.println(j);					
			}			
			
		}


	}

}
