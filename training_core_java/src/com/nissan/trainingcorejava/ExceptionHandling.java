/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Rishabh Dev Gupta
 *
 */
public class ExceptionHandling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int datamember=10/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			
			System.out.println("Finally block excecution...");
		}

	}

}
