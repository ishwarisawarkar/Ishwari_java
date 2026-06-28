package com.ishwari;

public class ConstructorDemo {
	ConstructorDemo(){
		System.out.println("Hello i am constructor");
	}
	ConstructorDemo(String name){
		System.out.println(name);
	}
	ConstructorDemo(int a){
		System.out.println(a);
	}
public static void main(String[] args){
ConstructorDemo obj1 =new ConstructorDemo();
ConstructorDemo obj2 =new ConstructorDemo("ishwari");
ConstructorDemo obj3=new ConstructorDemo(33);
}
}


