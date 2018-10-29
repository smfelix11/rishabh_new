/**
 * 
 */
package com.nissan.trainingcorejava;

import java.util.Scanner;

/**
 * @author HP
 *
 */
public class StringAssignment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a string-");
		String text=s.nextLine();
		if(text.isEmpty())
		{
			text=text.concat("Appended");
		}
		System.out.println("Appended string is-"+text);
		String a[]=text.split("");
		for(String i:a)
		{
			System.out.print(i+" ");
		}

	}

}
