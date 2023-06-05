package org.InterFace;

import java.util.Scanner;

public class InterFaceClass implements childInte {



	@Override
	public void userName() {
		System.out.println(" Enter User Name : ");
		
	}

	@Override
	public void password() {
		System.out.println(" Enter Password : ");
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		InterFaceClass ifs = new InterFaceClass();
		
		ifs.userName();
		ifs.password();
		
	

	}

}
