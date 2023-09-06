package com.programinig.class7;
import java.util.concurrent.TimeUnit;

public class HowSleepMethodWork  extends Thread {

	public static void main(String[] args) {
		
		HowSleepMethodWork t1 =  new HowSleepMethodWork();
		HowSleepMethodWork t2 = new HowSleepMethodWork();
		
		t1.start();
		t2.start();
	}
	
	public void run () {
		for(int i = 1; i<5; i++) {
			try {
				Thread.sleep(1000);
				TimeUnit.SECONDS.sleep(1);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
