/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Rishabh Dev Gupta
 *
 */
public class ThrowKeyword {

	/**
	 * @param args
	 */
	
	static void condition(int number)
	{
		if(number<10)
		{
			throw new ArithmeticException("not valid.");
		}
		else
		{
			System.out.println("You can go to college");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		condition(8);
	}

}
