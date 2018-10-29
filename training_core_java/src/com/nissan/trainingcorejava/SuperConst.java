/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author HP
 *
 */
class D
{
	D()
	{
		System.out.println("Parent constructor called");
	}
}
public class SuperConst extends D {

	/**
	 * @param args
	 */
	SuperConst()
	{
		super();//
		System.out.println("Child Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConst obj = new SuperConst();
	}

}
