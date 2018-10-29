/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Rishabh Dev Gupta
 *
 */
public class Joinmethod extends Thread {

	/**
	 * @param args
	 */
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			try
			{
				Thread.sleep(800);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Joinmethod j1= new Joinmethod();
		Joinmethod j2= new Joinmethod();
		Joinmethod j3= new Joinmethod();
		Joinmethod j4= new Joinmethod();
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
		j4.start();

	}

}
