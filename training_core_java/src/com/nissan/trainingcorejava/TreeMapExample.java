/**
 * 
 */
package com.nissan.trainingcorejava;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Rishabh Dev Gupta
 *
 */
public class TreeMapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map= new TreeMap<Integer,String>();
		
		map.put(100,"Rahul");
		map.put(101,"Nissan");
		map.put(99,"Mahesh");
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(""+m.getKey()+" "+m.getValue());
		}
	}

}
