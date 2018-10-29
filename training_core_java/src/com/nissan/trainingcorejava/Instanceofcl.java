/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author HP
 *
 */
class Parentcl
{
	void display()
	{}
	}
public class Instanceofcl extends Parentcl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instanceofcl i= new Instanceofcl();
		System.out.println(i instanceof Instanceofcl);
		System.out.println(i instanceof Parentcl);

	}

}
