/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author HP
 *
 */
class ParentInstof
{
	void display()
	{
		System.out.println("This is an instance of parent also.");
	}
}
public class Instof extends ParentInstof {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instof i=new Instof();
		if(i instanceof ParentInstof)
		{
			i.display();
		}
	}

}
