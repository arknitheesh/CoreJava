package org.strings;

public class Stringss {

	public static void main(String[] args) {

		String str = "Nitheesh";
		String st = "Demo";
		
		int length = str.length();
		String indent = str.indent(2);
		char charAt = str.charAt(1);
		boolean endsWith = str.endsWith("sh");
		
		System.out.println(length);
		System.out.println(indent);
		System.out.println(charAt);
		System.out.println(endsWith);

	}

}
