package com.basic.nonstatic;
class Student{
	long rollno;
	String name;
	int age;
	String gender;
	
	Student(){
		rollno=00000;
		name="Give me a name";
		age=00;
		gender="Sir me madam aa";	
	}
	public void studentDetails() {
		System.out.println("Name: "+name);
		System.out.println("Rollno: "+rollno);
		System.out.println("Age of Student: "+age);
		System.out.println("Gender of Student: "+gender);
	}
}
public class StudentForm {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="Shiva";
		s1.age=20;
		s1.rollno=192211356;
		s1.gender="Male";
		s1.studentDetails();
		System.out.println("++++++'.'======");
		System.out.println();
		
		Student s2=new Student();
		s2.name="Priya";
		s2.age=19;
		s2.rollno=12214362;
		s2.gender="Female";
		s2.studentDetails();
		System.out.println("++++++'.'======");
		System.out.println();
		
		Student s3 = new Student();
		s3.studentDetails();
		
		
		

	}

}
