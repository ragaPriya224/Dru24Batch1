package practice.multithreadingDemo.sync;

public class Demo {

	public synchronized void m1(String n) {
		for(int i = 0; i<5;i++) {
			System.out.print("hello team ");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				//
			}
			System.out.println(n);
		}
	}
}
