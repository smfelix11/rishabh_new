/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Rishabh Dev Gupta
 *
 */
public class LocalInnerClass {

	/**
	 * @param args
	 */
	
	private int dataValue=12345;
	
	void showMessage()
	{
		//Local inner class
		class Localclass{
			
			void display()
			{
				System.out.println(dataValue);
			}
		}
		Localclass lc= new Localclass();
		lc.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerClass l= new LocalInnerClass();
		l.showMessage();
	}

}
