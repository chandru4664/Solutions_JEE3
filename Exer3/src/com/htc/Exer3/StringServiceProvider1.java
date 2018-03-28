package com.htc.Exer3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringServiceProvider1 {
	
	
	String inputName;
	
		public String reverse(String inputName1) {

	    // getBytes() method to convert string 
        // into bytes[].
        byte [] strAsByteArray = inputName1.getBytes();
 
        byte [] result = 
                   new byte [strAsByteArray.length];
 
        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i<strAsByteArray.length; i++)
            result[i] = 
             strAsByteArray[strAsByteArray.length-i-1];
        String reverseOut = new String(result);
        
		return reverseOut;

	}
	
	class linstring {
		
		String array[]=new String[10];
		String a=new String();
		private static Scanner sc;
		
		public void linSearch(String string[],String search) {	
			string=array;
			search=a;
			int i;
			int flag=0;
			for(i = 0; i<10; i++)
			{
	            if (search.equals(string[i]))
	            {
	                flag = 1;
	                break;
	            }

	        }
	        if (flag ==1)
	        {
	            System.out.println("Word found at position " +(i+1));
	        }
	        else
	        {
	            System.out.println("Word not found.");
	        }
	
		}
	
	}
	
}


		//public String searchAndReplace(String input,String replace) {
		
//	}//

