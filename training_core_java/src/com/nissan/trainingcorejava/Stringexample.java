/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author HP
 *
 */
public class Stringexample {

	/**
	 * @param args
	 */
public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Nissan";
		//java string literal
		
		String sone = new String("Nissan is the company");
		//using the new keyword
		
		System.out.println(s);
		System.out.println(sone);
		//charAt()
		char a=s.charAt(2);
		System.out.println(a);
		//length()
		int l=s.length();
		System.out.println(l);
		//String.format()
		String new_s=String.format("We work in %s , Trivandrum", s);
		System.out.println(new_s);
		//indexOf()
		System.out.println(s.indexOf("is"));
		//toLowerCase()
		System.out.println(s.toLowerCase());
		//toUpperCase()
		System.out.println(s.toUpperCase());
		//trim()
		String sp="  Hello String  ";
		System.out.println(sp+s);
		System.out.println(sp.trim()+s);
		
		//concatination
		String c= "India";
		System.out.println(c.concat(" is a country"));
		
		//join()
		String joinString= String.join("-","Hello","India");
		System.out.println(joinString);
		//isEmpty()
		String empty="";
		String notempty="is not empty";
		
		System.out.println(empty.isEmpty());
		System.out.println(notempty.isEmpty());
		
		//equals() and equalsIgnore case
		
	}

}
