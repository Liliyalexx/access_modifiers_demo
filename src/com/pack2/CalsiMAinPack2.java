package com.pack2;

import com.pack1.Calculator;


public class CalsiMAinPack2 {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.printX();
//		c.m=1000;
//		System.out.println("m = " +c.m);
//		c.l = 35;
//		System.out.println("c = " +c.l);
//		c.z = 46;
//		System.out.println("z = " +c.z);
		System.out.println("Accessing outside package");
		c.k = 300;
		System.out.println("k = " + c.k);

	}

}
