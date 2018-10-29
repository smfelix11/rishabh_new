/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author HP
 *
 */

class A{
	
	void eat()
	{
		System.out.println("A is eating");
	}
}

class B extends A{
	
	void eat()
	{
		System.out.println("B is eating");
	}
	 void test()
	 {
		 System.out.println("This method is in B");
	 }
	 
	 void working()
	 {
		 super.eat();
		 eat();
		 test();
	 }
}
public class SuperOne {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.working();
		
	}

}
