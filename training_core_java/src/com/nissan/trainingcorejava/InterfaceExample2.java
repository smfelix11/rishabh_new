/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author HP
 *
 */

interface Sort
{
	void sort(int a[]);
}
public class InterfaceExample2 implements Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample2 i= new InterfaceExample2();
		int a[]= {3,6,1,3,2,8,9,0,4,3,9,7,4};
		i.sort(a);
	}

	@Override 
	public void sort(int[] a) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[j];
					a[j]=a[i];
					a[i]=t;
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		
	}

}
