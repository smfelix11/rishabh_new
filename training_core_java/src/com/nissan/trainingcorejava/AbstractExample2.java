/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author HP
 *
 */

abstract class ParentClass2
{
	public ParentClass2() {
		// TODO Auto-generated constructor stub
	}
	abstract void run();
	void display()
	{
		System.out.println("Displaying....");
	}
}
public class AbstractExample2 extends ParentClass2 {

	void run()
	{
		System.out.println("Running");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractExample2 obj =new AbstractExample2();
		obj.display();
		obj.run();
	}

}
