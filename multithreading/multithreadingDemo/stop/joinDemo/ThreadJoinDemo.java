package practice.multithreadingDemo.stop.joinDemo;


public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException  {
		Thread.currentThread().join();
		
		MyThread t = new MyThread();// instantiated a thread
		t.start(); //starting a thread 
		t.join();
		for(int i = 0;i<5;i++) {
			System.out.println("main thread"+Thread.currentThread().getPriority());
		}
	}

}
