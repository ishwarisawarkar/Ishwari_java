package com.ishwari;

public class StringMutable {
	public static void main(String[] args) {
		//not thread safe
		StringBuilder sb=new StringBuilder("java");
		sb.append("Programming");
		System.out.println(sb);
		
		//thread safe
		StringBuffer sb2=new StringBuffer("java");
		sb2.append("Programming");
		System.out.println(sb2);
	}

}
