package javaProgrammingPractice;

public class lenghtofString {

	public static void main(String[] args) {
//		String str1 = "hello";
//		String str2 = "helloWorld";
//		System.out.println(str1.length());
//		System.out.println(str2.length());
	
	//for split the strings
		String str2 = "this is my book";
          String[] s2 = str2.split(" ");
          for(String x:s2) 
          { 
        	  System.out.println(x); 
          }
          System.out.println("the number of given string is : " +s2.length);  
         
}}  
          
		
		
	

