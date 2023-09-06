package com.programinig.class7;

class customer {

	int amount = 1000;

	public synchronized void withdraw(int amount) {

		System.out.println("user has to come to withdraw amount" + amount);

		if (this.amount < amount) {

			System.out.println("less balance ,waiting to deposit");

			try {

				wait();

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

		}

		this.amount -= amount;

		System.out.println("withdraw completed....");

	}

	public synchronized void deposit(int amount) {

		System.out.println("user has to come to deposit amount");

		this.amount += amount;

		System.out.println(" deposit completed for the amount" + amount);

	}

}

public class BankingApplication {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		final customer c1 = new customer();

		new Thread() {

			public void run() {

				c1.withdraw(15000);

			}

		}.start();

		new Thread() {

			public void run() {

				c1.deposit(10000);

			}

		}.start();

	}

}