package practice.multithreadingDemo.sync;

public class MyThread extends Thread{
	Demo d;
	String name;
	MyThread(Demo d , String name){
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.m1(name);
	}
}
