/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author HP
 *
 */
class Animal
{
	String color="green";
}
class Cheetah extends Animal
{
	String color="orange";
	
	public void display()
	{
		System.out.println(this.color);
		System.out.println(super.color);
	}
}
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cheetah c = new Cheetah();
		c.display();
		System.out.println(c.color);
	}

}
