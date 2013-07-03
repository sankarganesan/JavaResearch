
package com.mitosis.test;

import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashMap;
import java.util.List;
//import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {
  //public static final String EXAMPLE_TEST = "This is my small example "
     // + "string hich I'm going to " + "use for pattern matching.";

  /*public static void main(String[] args) {
    System.out.println(EXAMPLE_TEST.matches("\\w.*"));
    String[] splitString = (EXAMPLE_TEST.split("\\s+"));
    System.out.println(splitString.length);// Should be 14
    for (String string : splitString) {
      System.out.println(string);
    }
    // Replace all whitespace with tabs
    System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));
  }*/
	 // public static void main(String[] args) {
			/*List<String> input = new ArrayList<String>();
			input.add("123-45-6789");
			input.add("9876-5-4321");
			input.add("987-65-4321 (attack)");
			input.add("987-65-4321 ");
			input.add("192-83-7465");


			for (String ssn : input) {
				if (ssn.matches("^(\\d{3}-?\\d{2}-?\\d{4})$")) {
					System.out.println("Found good SSN: " + ssn);
				}
			}
		*/public String callback(String input){
		  //String input = "I have a cat, but I like my dog better.";

			Pattern p = Pattern.compile("(clientId=)(\\d+)");
			Matcher m = p.matcher(input);

			List<String> animals = new ArrayList<String>();
			while (m.find()) {
				System.out.println("clind ID " + m.group() + ".");
				animals.add(m.group());
			}
			
			
			
			//Map<String,Object> map=new HashMap<String,Object>();
			
			
			return null;
		  }
}
