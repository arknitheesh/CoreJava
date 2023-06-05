package org.exam;

import java.util.HashSet;

public class Pangram {

	public static void main(String[] args) {
	     String s="The quick brown fox jumps over the lazy dog...$%@";
	      s=s.toLowerCase().replaceAll(" ","");
	      char arr[]=s.toCharArray();
	      HashSet<Character> set=new HashSet<Character>();
	      for(char c:arr)
	      {
	         System.out.println(c);
	         //if(Character.isLetter(c))
	         if((int)c>=97&&(int)c<=122)
	            set.add(c);
	      }
	      if(set.size()==26)
	           System.out.println("Pangram String");
	      else
	           System.out.println("Not Pangram String");
	      System.out.println(set);
	      
	      
	}

}
