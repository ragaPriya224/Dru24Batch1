package practice.multithreadingDemo.stop.yeidlDemo;

import practice.multithreadingDemo.stop.yeidlDemo.MyThread;

public class ThreadYieldDemo {

	public static void main(String[] args) {
		MyThread t = new MyThread();// instantiated a thread
		t.start(); //starting a thread 
		for(int i = 0;i<5;i++) {
			System.out.println("main thread"+Thread.currentThread().getPriority());
		}
	}

}
