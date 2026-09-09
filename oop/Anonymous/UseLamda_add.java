package com.oop.Anonymous;
interface Arithmetic{
	void add(int a , int b);
}
public class UseLamda_add {

	public static void main(String[] args) {
		Arithmetic arithmetic =(a,b)->System.out.println("a+b: "+(a+b));	
		arithmetic.add(2, 3);
		arithmetic.add(12, 40);
		arithmetic.add(100, 89);
		
		// TODO Auto-generated method stub
		

	}

}
