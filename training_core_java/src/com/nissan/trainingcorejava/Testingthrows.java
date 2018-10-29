/**
 * 
 */
package com.nissan.trainingcorejava;

import java.io.IOException;

/**
 * @author Rishabh Dev Gupta
 *
 */
public class Testingthrows {

	/**
	 * @param args
	 */
	void master() throws IOException
	{
		throw new IOException("Error has occurred");
	}
	
	void notmaster() throws IOException{
		master();
	}
	
	void puremaster()
	{
		try {
			notmaster();
		}
		catch(Exception e) {
			System.out.println("The error has been handled");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testingthrows obj= new Testingthrows();
		obj.puremaster();
	}

}
