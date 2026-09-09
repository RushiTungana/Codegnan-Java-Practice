package com.oop.threads.ex;
class Person extends Thread{
	Person(String name){
		super(name);
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+": Person starts the task");
		System.out.println("Task is completed");
	}
}
public class UseJoin {
	public static void main(String[] args) {
		Person p1=new Person("Person1");
		Person p2 = new Person("Person2");
		p1.start();
		p2.start();
		try {
			p2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();  
			
		}
		System.out.println("Main thread started");
		System.out.println("Task is completed");
	}

}
