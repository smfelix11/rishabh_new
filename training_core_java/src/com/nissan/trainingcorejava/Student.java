/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author HP
 *
 */
//assg-3 Inheritance
class College
{
	String collegeName;
	
	public void setDetails(String n)
	{
		this.collegeName=n;
	}
	
}
public class Student extends College {

	/**
	 * @param args
	 */
	String sname;
	String branch;
	int year;
	int sid;
	
	public void setDetails(String sname,String b,int y,int id,String cname)
	{
		super.setDetails(cname);
		this.sname=sname;
		this.branch=b;
		this.year=y;
		this.sid=id;
		System.out.println(this.sname);
		System.out.println(this.branch);
		System.out.println(this.year);
		System.out.println(this.sid);
		System.out.println(this.collegeName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setDetails("Shyaam", "IT", 3, 101,"XYZ Institute");
		int a[]=new int[10];
		System.out.println(a[1]);
	}

}
