package com.ishwari;
import java.util.LinkedList;
public class LinkedList3 {
	public static void main(String[] args) {
		LinkedList<String>MobileBrands=new LinkedList<String>();
		MobileBrands.add("Apple");
		MobileBrands.add("Samsung");
		MobileBrands.add("OnePlus");
		MobileBrands.add("Motorola");
		
		System.out.println("First brands:"+MobileBrands.getFirst());
		System.out.println("Last brands:"+MobileBrands.getLast());
		System.out.println("Complete list:"+MobileBrands);
	}
}
