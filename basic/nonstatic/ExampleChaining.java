package com.basic.nonstatic;
class B{
	B(){
		System.out.println("No-arg");
	}
	B(int A){
		this();
		System.out.println("A: "+A);
	}
}
public class ExampleChaining {

	public static void main(String[] args) {
		B obj1=new B(10);

	}

}
