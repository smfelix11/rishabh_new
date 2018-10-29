/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author HP
 *
 */

interface Calc
{
	void add(int a,int b);
	void subtract(int a,int b);
	void multiply(int a,int b);
	void divide(int a,int b);
	default void square(int a){
		System.out.println(a*a);
	}
}
public class InterfaceExample implements Calc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample i= new InterfaceExample();
		i.add(2, 3);
		i.subtract(5, 2);
		i.multiply(2, 3);
		i.divide(10, 5);
		i.square(10);
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}

	@Override
	public void subtract(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
	}

	@Override
	public void multiply(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);
	}

	@Override
	public void divide(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a/b);
	}

}
