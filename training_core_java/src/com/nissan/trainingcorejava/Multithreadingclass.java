/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Rishabh Dev Gupta
 *
 */
public class Multithreadingclass implements Runnable {
	
	public void run()
	{
		System.out.println("Running a thread.");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multithreadingclass t= new Multithreadingclass();
		Thread obj= new Thread(t);
		obj.start();
		
	}

}
