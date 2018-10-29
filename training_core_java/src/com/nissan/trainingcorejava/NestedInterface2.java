/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author HP
 *
 */
interface Palindrome
{
  int reverse(int a);
  interface SubPalidrome{
	  
	  void check(int a,int r);
  }
  
}
public class NestedInterface2 implements Palindrome,Palindrome.SubPalidrome {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedInterface2 i=new NestedInterface2();
		int a=121;
		int rev=i.reverse(a);
		i.check(a, rev);
	}

	@Override
	public void check(int a,int r) {
		// TODO Auto-generated method stub
		if(a==r)
		{
			System.out.println("Palindrome.");
		}
		else
		{
			System.out.println("Not a palindrome.");
		}
	}

	@Override
	public int reverse(int a) {
		// TODO Auto-generated method stub
		int rev=0;
		while(a!=0)
		{
			int rem=a%10;
			rev= rev*10+rem;
			a=a/10;
		}
		return rev;
	}

}
