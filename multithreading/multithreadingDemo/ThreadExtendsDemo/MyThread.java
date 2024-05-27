package practice.multithreadingDemo.ThreadExtendsDemo;

public class MyThread extends Thread{

	public void start() {
		System.out.println("starting");
	}
	public void run() {
		for(int i = 0;i<5;i++) {
			System.out.println("child " +Thread.currentThread().getName());
		}
	}
	

	public void run(int j) {
		for(int i = 0;i<5;i++) {
			System.out.println("overloaded child " +Thread.currentThread().getName());
		}
	}
}
