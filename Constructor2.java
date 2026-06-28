package com.ishwari;

public class Constructor2 {
	public void siri(String name) {//paramaterized constructor
		System.out.println("Hey how are you");
		System.out.println(name);
	}
	public static void main(String[] args){
		Constructor2 obj=new Constructor2();
		obj.siri("ishwari");//argument
		obj.siri("ishwari");
	}
}
