/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Rishabh Dev Gupta
 *
 */

interface Interface1
{
	void run();
}
public class TestClass implements Interface1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass obj=new TestClass();
		obj.run();
		obj.run(2);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Overriden method");
		
	}
	public void run(int a)
	{
		System.out.println(a);
	}

}
