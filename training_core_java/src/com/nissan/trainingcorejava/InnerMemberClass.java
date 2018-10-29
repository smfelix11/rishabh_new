/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Rishabh Dev Gupta
 *
 */

class InnerParent
{
	
	private int datavalue=10;
	
	class Inner
	{
		public void message()
		{
			System.out.println("Private member "+datavalue);
		}
	}
}
public class InnerMemberClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InnerParent i= new InnerParent();
		InnerParent.Inner in=i.new Inner();
		in.message();
	}

}
