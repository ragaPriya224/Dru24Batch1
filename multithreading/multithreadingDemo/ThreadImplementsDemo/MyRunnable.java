package practice.multithreadingDemo.ThreadImplementsDemo;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i<5;i++) {
			Thread.currentThread().setName("childT");
			System.out.println("child  " +Thread.currentThread().getName());
		}
		
	}

}
