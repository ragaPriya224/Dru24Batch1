package practice.multithreadingDemo.sync;

public class SyncDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		Demo d2 = new Demo();
		d.

		MyThread t1 = new MyThread(d,"morning");
		MyThread t2 =new MyThread(d2,"afternoon");
		t1.start();
		t2.start();
	}

}
