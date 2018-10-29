/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author HP
 *
 */
//assignment
public class StringExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"Rishabh","Jeevesh","Shubham","Shyam","Rahul","Amrit"};
		
		for(String i:s)
		{
			System.out.println("length-"+i.length());
			System.out.println("Char at 3-"+i.charAt(3));
			System.out.println("Substring from 2,5-"+i.substring(2,5));
			System.out.println(String.format("Name is %s", i));
			
		}
	}

}
