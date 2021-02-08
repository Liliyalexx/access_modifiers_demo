package com.pack1;

public class CaciMainPack1 {
	public static void main (String[] args) {
		Calculator c=new Calculator();
		//c.x=100; -> private within the class only
		
		c.printX();
		c.m=1000;
		System.out.println("m = " +c.m);
		c.l = 35;
		System.out.println("c = " +c.l);
		c.z = 46;
		System.out.println("z = " +c.z);
		c.k = 300;
		System.out.println("k = " + c.k);
	}

}
