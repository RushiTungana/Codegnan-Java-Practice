package com.basic.nonstatic;

import com.basic.staticclass.HotelStatic;

public class Customer {
	String name;
	int roomno;
	public static void main(String[] args) {
		Customer c1=new Customer();
		System.out.println(c1);
		c1.name="Hemanth";
		c1.roomno=143;
		System.out.println("Hotal name: "+HotelStatic.name);
		System.out.println("Customer name: "+c1.name);
		System.out.println(c1.name+" Room no: "+c1.roomno);
		System.out.println("Address of Hotel: "+HotelStatic.Address);
		System.out.println();
		
		Customer c2=new Customer();
		System.out.println(c2);
		c2.name="Sai";
		c2.roomno=420;
		System.out.println("Hotel name: "+HotelStatic.name);
		System.out.println("Customer name: "+c2.name);
		System.out.println(c2.name+" Room no: "+c2.roomno);
		System.out.println("Address of Hotel: "+HotelStatic.Address);
		System.out.println();
		
		Customer c3=new Customer();
		System.out.println(c3);
		c3.name="Ravi";
		c3.roomno=210;
		System.out.println("Hotel name: "+HotelStatic.name);
		System.out.println("Customer name: "+c3.name);
		System.out.println(c3.name+" Room no: "+c3.roomno);
		System.out.println("Address of Hotel: "+HotelStatic.Address);
		
		
		
		
		
		

	}

}
