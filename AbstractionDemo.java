package com.ishwari;

abstract class ATM{
	abstract void  withdraw();
}
class HDFC extends ATM{
	void withdraw() {
		System.out.println("Money Withdraw succesfully");
	}
}
public class AbstractionDemo {
	public static void main(String[] args){
		ATM m=new HDFC();
		m.withdraw();
	}

}
