/**
 * 
 */
package com.nissan.trainingcorejava;

import java.util.Scanner;

/**
 * @author Rishabh Dev Gupta
 *
 */
public class ScannerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My name is Nissan";
		
		Scanner s1= new Scanner(s);
		s=s.replace(" ", "-");
		System.out.println(""+s);
	}

}
