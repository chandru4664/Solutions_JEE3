package com.htc.Exer3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

     class linString{
		 String array[] = new String[10];
		    String a = new String();
		    public void linsearch(String string[], String search)
		    {
		        string = array;
		        search = a;

		        int i;
		        int flag = 0;
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
    
     class ReverseString
     {

             String input
             = "GeeksforGeeks";
      
             // getBytes() method to convert string 
             // into bytes[].
             byte [] strAsByteArray = input.getBytes();
      
             byte [] result = new byte [strAsByteArray.length];
      
             // Store result in reverse order into the
             // result byte[]
             
             for (int i = 0; i<strAsByteArray.length; i++)
                 result[i] = 
                  strAsByteArray[strAsByteArray.length-i-1];
      
             System.out.println(new String(result));
     }

    
     
     public class StringSErviceProvider {
    	 
	 public static void main(String args[]) throws IOException
	    {
		 System.out.println("Please enter either of the operation Reverse String-R,Liear Search-L,Search and replace-SR");
		 Scanner sc=new Scanner(System.in); 
		 String option=sc.next();
		 switch(option)
		 {
			 case("R"):
			ReverseString rs=new ReverseString();
			 String Input=sc.next();
			  break;
			 case("L"):
		 
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        //StringSErviceProvider ssp=new StringSErviceProvider();
	        linString obj = new linString();
	        System.out.println("Enter any 10 words.");

	        String enter [] = new String[10];
	        int i;
	        for (i = 0; i<10; i++)
	        {

	            enter[i] = br.readLine();

	        }
	        System.out.println("Enter word to be searched.");
	        String search1 = br.readLine();
	        obj.linsearch(enter, search1);
	        break;
	     case("SR"):
			 
			 break;
		 }
	 }
}
}