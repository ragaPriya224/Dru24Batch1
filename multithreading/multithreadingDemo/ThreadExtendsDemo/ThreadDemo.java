package practice.multithreadingDemo.ThreadExtendsDemo;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();// instantiated a thread
		t.start(); //starting a thread 
		for(int i = 0;i<5;i++) {
			System.out.println("main " +Thread.currentThread().getName());
		}
	}

}
