package comm.oop.Threads.ex;
class BaseTask{
	
}
class Task extends BaseTask implements Runnable{
	public void run() {
		System.out.println("Task 1 in task thread"+Thread);
	}
	
}
public class UseThread {
	public static void main(String[] args) {
		System.out.println("Main methods start"+Thread.currentThread().getName());
		Task t1 = new Task();
		Task t2 = new Task();
		Task t3 = new Task();
		Thread thread1 = new Thread(t1, "Task thread-1");
		Thread thread2 = new Thread(t2, "Task thread-2");
		Thread thread3 = new Thread(t3, "Task thread-3  ");
		thread1.start();
		thread2.start();
		thread3.start();
		System.out.println("Main method end");
		
	}

}
