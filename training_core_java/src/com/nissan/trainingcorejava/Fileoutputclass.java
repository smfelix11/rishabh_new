/**
 * 
 */
package com.nissan.trainingcorejava;

import java.io.FileOutputStream;

/**
 * @author Rishabh Dev Gupta
 *
 */
public class Fileoutputclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileOutputStream fout= new FileOutputStream("D:\\test.txt");
			String a ="Nissan";
			byte b[]=a.getBytes();
			fout.write(b);
			fout.close();
		}
		catch(Exception e)
		{
			
		}
		
		
	}

}
