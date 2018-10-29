/**
 * 
 */
package com.nissan.trainingcorejava;

import java.util.Scanner;

/**
 * @author Rishabh Dev Gupta
 *
 */
public class JoinAssg extends Thread {

	/**
	 * @param args
	 */
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			try
			{
				Thread.sleep(3000);
				System.out.println("Input-");
				Scanner s= new Scanner(System.in);
				System.out.println(""+s.nextLine());
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated Assg stub
		
		JoinAssg j1= new JoinAssg();
		JoinAssg j2= new JoinAssg();
		JoinAssg j3= new JoinAssg();
//		JoinAssg j4= new JoinAssg();
		j1.start();
		try
		{
			j1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		j2.start();
		j3.start();
//		j4.start();

	}

}
