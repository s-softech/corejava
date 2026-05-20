package com.javaintro;

public class st2 {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main method started from st2 class");

		Class c = Class.forName("com.javaintro.st1");
		System.out.println(c);
		Class c2 = Class.forName("java.lang.String");
		System.out.println(c2);
		Class c1 = Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println(c1);
		System.out.println("main methed ended");
	}

}
