package com.basic.staticclass;

public class Usecompany {

	public static void main(String[] args) {
		System.out.println("Name: "+ Company.name);
		System.out.println("Code: "+Company.code);
		Company.CompanyDetails();
		System.out.println("========");
		Company e1=new Company();
		e1.employee="Shiva";
		System.out.println(e1);
		System.out.println(e1.employee);
		Company.CompanyDetails();
		System.out.println("========");
		Company e2=new Company();
		e2.employee="hemanth";
		System.out.println(e2);
		System.out.println(e2.employee);
		Company.CompanyDetails();

	}

}
