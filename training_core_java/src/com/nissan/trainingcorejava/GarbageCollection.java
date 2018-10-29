/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Rishabh Dev Gupta
 *
 */
public class GarbageCollection {

	/**
	 * @param args
	 */
	
	public void finalize()
	{
		System.out.println("Object is garbage collected");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollection s1= new GarbageCollection();
		GarbageCollection s2= new GarbageCollection();
		
		s1=null;
		s2=null;
		
		System.gc();
		System.out.println(""+s1);
	}

}
