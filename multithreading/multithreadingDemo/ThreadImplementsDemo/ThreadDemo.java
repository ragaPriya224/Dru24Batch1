package practice.multithreadingDemo.ThreadImplementsDemo;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable r = new MyRunnable();// instantiated a thread
		Thread t = new Thread(r);
		t.start(); //starting a thread
		
		for(int i = 0;i<5;i++) {
			System.out.println("main " +Thread.currentThread().getName());
		}
	}

}
