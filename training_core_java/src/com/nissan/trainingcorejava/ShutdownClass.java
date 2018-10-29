/**
 * 
 */
package com.nissan.trainingcorejava;

import java.io.IOException;

/**
 * @author Rishabh Dev Gupta
 *
 */
public class ShutdownClass {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");
	}

}
