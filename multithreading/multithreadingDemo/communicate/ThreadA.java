package practice.multithreadingDemo.communicate;

public class ThreadA {

	public static void main(String[] args) throws InterruptedException {

		ThreadB b = new ThreadB();
		b.start();
		synchronized (b) {
			System.out.println(" main gonna call wait method");
			b.wait();
			System.out.println("main got notification call ");
			System.out.println(b.total);
		}

		System.out.println("done");
	}

}
