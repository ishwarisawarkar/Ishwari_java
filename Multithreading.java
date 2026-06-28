package com.ishwari;
class BoilWater extends Thread{
	public void run() {
		System.out.println("BoilingWater");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("water is ready");
	}
}
class BoilMilk extends Thread{
	public void run() {
		System.out.println("Boiling milk");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Milk is ready.\n");
	}
}
class GrindCoffee extends Thread{
	public void run() {
		System.out.println("Grinding coffee beans...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Coffee powder is ready...");
	}
}
public class Multithreading {
	public static void main(String[] args) {
		 BoilWater water=new BoilWater();
		 BoilMilk milk=new BoilMilk();
		 GrindCoffee coffee=new GrindCoffee();
		 water.start();
			 try {
					milk.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			 milk.start();
			 try {
					coffee.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			 System.out.println("Coffee is ready!");
	}
}
