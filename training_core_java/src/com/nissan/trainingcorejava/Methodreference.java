/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Rishabh Dev Gupta
 *
 */
interface Speak{
	
	public void speaking();
}
public class Methodreference {

	/**
	 * @param args
	 */
	
	public static void speaksomething()
	{
		System.out.println("Hello Nissan- I am static");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Speak s=Methodreference::speaksomething;
		s.speaking();
		

	}

}
