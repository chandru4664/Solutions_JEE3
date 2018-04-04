/**
 * StringServiceProvider.java
 */
package homeWork3;

/**
 * @author 1483
 * Reverse String
 */
		 
	public class StringServiceProvider {
	    public static void main(String[] args)
	    {
	        String input = "HTC Java Reverse String Example";
	 
	        StringBuilder instr = new StringBuilder();
	 
	        // append a string into StringBuilder instr
	        instr.append(input);
	 
	        // reverse StringBuilder input1
	        instr = instr.reverse();
	 
	        // print reversed String
	        System.out.println(instr);
	        
	        // Search a string 3.b 
	        String text = "HTC Java Reverse String Example 3.b";
		      System.out.print(text.contains("Java"));
		      
		    // Replace operation in a string 3.c
		      
		      String Str = new String("HTC Java Reverse String Example 3.c");

		      System.out.print(" Replaced String :" );
		      System.out.println(Str.replace("HTC", "Ciber"));

		      System.out.print(" Replaced Value :" );
		      System.out.println(Str.replace("Java", "Java Example"));
		      
	    }
	 }
	