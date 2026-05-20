package com.javaintro;

public class std1 {

	public void display() {
		System.out.println("object display method called");
	}
	public static void main() {

		std1 s1 = new std1();
		std1 s2 = new std1();
		std1 s3 = new std1();
		s1.display();
		s2.display();
		s1 = s2;
		s2 = s3;

		System.gc();
	}
	@Override
	protected void finalize() {
		System.out.println("Strudent object finalize is called before destroying by garbage collector");
	}
}
