package com.basic.nonstatic;
class employee{
	static String brand="IBM";
	String name;
	int salary;
	
	employee(){
		name="Give me your name";
		salary=0;
	}
	employee(String name, int salary){
		this.name=name;
		this.salary=salary;
	}
	public void employeeform() {
		System.out.println(this);
		System.out.println("Company name: "+employee.brand);
		System.out.println("Name of employee: "+this.name);
		System.out.println("Salary 0f employee: "+this.salary);
	}
	
}
public class EmployeeDetails {

	public static void main(String[] args) {
		employee e1=new employee("Shiva",3000000);
		e1.employeeform();
		System.out.println("e1: "+e1);
		System.out.println("========'.'========");
		System.out.println();
		
		employee e2=new employee("Hemanth",345000);
		e2.employeeform();
		System.out.println("e2: "+e2);
		System.out.println("========'.'========");
		System.out.println();
		employee e3=new employee();
		e3.employeeform();
	}

}
