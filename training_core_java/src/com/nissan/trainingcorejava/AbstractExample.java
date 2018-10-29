/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author HP
 *
 */
abstract class ParentClass{
	abstract void run();
}

public class AbstractExample extends ParentClass {

	/**
	 * @param args
	 */
	void run()
	{
		System.out.println("Hellloooo");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractExample ab= new AbstractExample();
		ab.run();
	}

}
