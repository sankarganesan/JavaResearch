package com.mitosis.test;

public class StingBuilderDemo {
	 public static void main(String[] args) {
		  
		    StringBuilder str = new StringBuilder("India ");
		    System.out.println("string = " + str);
            str.append('!');
		    System.out.println("After append = " + str.toString());
		    str.replace(2, 5, "ndra");
		    System.out.println("After append = " + str.toString());
		    str = new StringBuilder("Hi "); 
		    System.out.println("string = " + str);
		    str.append(123);
		    System.out.println("After append = " + str.toString());
		    
		  }
}
