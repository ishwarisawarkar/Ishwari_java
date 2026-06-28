package com.ishwari;
//single inheritance
class Dad{
	public void car() {
		System.out.println("BMW");
	}
}
public class Child extends Dad {
	public static void main(String[] args) {
	Child rehan=new Child();
	rehan.car();
}
}
