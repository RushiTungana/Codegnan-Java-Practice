package com.oop.threads.ex;
class Worker extends Thread{
	public void run() {
		System.out.println("Worker thread starts");
		//simulate work time
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Worker task completed");
	}
}
public class UseSleep {

	public static void main(String[] args) {
		Worker w =  new Worker();
		w.start();
		System.out.println("Main has started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main has completed");
		// TODO Auto-generated method stub

	}

}
