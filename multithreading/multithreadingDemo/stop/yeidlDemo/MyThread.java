package practice.multithreadingDemo.stop.yeidlDemo;

public class MyThread extends Thread {

	@Override
	public void run() {
		for(int i = 0;i<5;i++) {
			Thread.yield();
			System.out.println("child thread"+Thread.currentThread().getPriority());
		}

	}
}
