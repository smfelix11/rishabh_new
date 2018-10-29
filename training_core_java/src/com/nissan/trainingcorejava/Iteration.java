/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author HP
 *
 */
public class Iteration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,3,4,1,2,5,6,7,8,6};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(i==j)
				{
					continue;
				}
				else if(a[i]==a[j])
				{
					System.out.println(a[i]+" at "+j+" address="+a+Integer.toHexString((3*Integer.SIZE)));
				}
			}
		}
	}

}
