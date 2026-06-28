package com.ishwari;
import java.util.LinkedHashMap;
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> names=new LinkedHashMap<Integer,String>();
		names.put(1, "Amit");
		names.put(2, "Aryan");
		names.put(3, "Adesh");
		names.put(4, "Akshay");
		System.out.println(names);
	}
}
