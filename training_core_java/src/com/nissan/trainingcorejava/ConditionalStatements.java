/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author HP
 *
 */
public class ConditionalStatements {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String names[]= {"Rahul","Rishabh","Pooja","Shubham","Amrit"};
	
	for(int i=0;i<names.length;i++)
	{
		if(names[i]=="Pooja")
		{
			System.out.println(i);
			break;
		}
		else if(i==names.length-1)
		{
			System.out.println("Not found");
		}
	}
	
//	int a=10;
//	int b=20;
//	int c=30;
//	System.out.println(a<b && a<c);
//	System.out.println(a<b & a<c);
//	System.out.println(b>a || b>c);
//	System.out.println(b>c | b>c);
	
	}

}
