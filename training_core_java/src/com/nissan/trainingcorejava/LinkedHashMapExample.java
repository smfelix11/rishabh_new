/**
 * 
 */
package com.nissan.trainingcorejava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Rishabh Dev Gupta
 *
 */
public class LinkedHashMapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> map= new LinkedHashMap<Integer,String>();
		
		map.put(100,"Rahul");
		map.put(101,"Nissan");
		map.put(null,"Mahesh");
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(""+m.getKey()+" "+m.getValue());
		}

	}

}
