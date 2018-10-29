/**
 * 
 */
package com.nissan.trainingcorejava;

import java.io.FileOutputStream;

/**
 * @author Rishabh Dev Gupta
 *
 */
public class FileoutputAssg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileOutputStream fout= new FileOutputStream("D:\\Fibo.txt");
			
			int a=0, b=1,c=0;
			String s=""+a+" "+b;
			while(c<50)
			{
				c=a+b;
				s=s+" "+c;

				a=b;
				b=c;
			}
			
			byte by[]=s.getBytes();
			fout.write(by);
			fout.close();
			System.out.println("Completed");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


	}

}
