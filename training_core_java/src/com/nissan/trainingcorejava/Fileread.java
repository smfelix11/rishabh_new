/**
 * 
 */
package com.nissan.trainingcorejava;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Rishabh Dev Gupta
 *
 */
public class Fileread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fin=new FileInputStream("D:\\fibo.txt");
			int i=0;
			StringBuffer b= new StringBuffer();
			while((i=fin.read())!=-1)
			{
//				System.out.println(i);
				b.append((char)i);
			}
			fin.close();
			String s=b.toString();
			System.out.println(s);
			String ar[]=s.split(" ");
			ArrayList<Integer> inAr= new ArrayList<>();
			for(String temp:ar)
			{
				inAr.add(Integer.parseInt(temp));
			}
			Collections.sort(inAr);
			
			FileOutputStream fout= new FileOutputStream("D:\\sorted.txt");
			StringBuilder sb = new StringBuilder();
			for (int k = inAr.size() - 1; k >= 0; k--) {
			  int num = inAr.get(k);
			  sb.append(" "+num);
			}
			String result = sb.toString();
			byte by[]=result.getBytes();
			fout.write(by);
			fout.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
