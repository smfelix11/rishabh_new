/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author HP
 *
 */

interface Draw
{
	void drawsomething();
	default void print()
	{
		System.out.println("This can be printed");
	}
	
}
interface Write
{
	void writesomething();
	
}


public class JavaInterface implements Draw {

	/**
	 * @param args
	 */
	public void drawsomething() {
		System.out.println("This is a method of interface");
	}
	
	public void print()
	{
		System.out.println("Overriding..");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaInterface j= new JavaInterface();
		j.drawsomething();
		j.print();
	}

}
