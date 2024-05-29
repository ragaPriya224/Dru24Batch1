package practice.multithreadingDemo.communicate;

public class ThreadB extends Thread {
	int total = 0;
	public void run() {
		synchronized (this) {
			System.out.println("child thread starts calc");

			for(int i = 0;i<=50;i++) {
				total = total+i;
			}
			System.out.println("child thread gives notify call");
			this.notify();
		}
	}
}
