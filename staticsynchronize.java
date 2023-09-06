package com.programinig.class7;

class SharedResources2 {

	// synchronized method

	synchronized static void print(int n) {

		for (int i = 1; i <= 5; i++) { // we can make a synchronized BLOCK too

			System.out.println(n * 1);

			try {

				Thread.sleep(1000);

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

		}

	}
}

class MyThread3 extends Thread {

	public void run() {

		SharedResources2.print(5);

	}

}

class MyThread4 extends Thread {

	public void run() {

		SharedResources2.print(10);

	}

}

class MyThread5 extends Thread {

	public void run() {

		SharedResources2.print(15);

	}

}

class MyThread6 extends Thread {

	public void run() {

		SharedResources2.print(20);

	}

}

public class staticsynchronize {

	public static void main(String[] args) {

		MyThread3 t1 = new MyThread3();

		MyThread4 t2 = new MyThread4();

		MyThread5 t3 = new MyThread5();

		MyThread6 t4 = new MyThread6();

		t1.start();

		t2.start();

		t3.start();

		t4.start();

	}

}