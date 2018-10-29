/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author HP
 *
 */
//Parameterised constructor
public class StudentDetails {

	/**
	 * @param args
	 */
	int sId;
	String sName;
	
	public StudentDetails(int id,String name) {
		this.sId= id;
		this.sName=name;
		// TODO Auto-generated constructor stub
	}
	
	void dislplay()
	{
		System.out.println(sId+" "+sName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails obj= new StudentDetails(123,"Shyam");
		obj.dislplay();
	}

}
