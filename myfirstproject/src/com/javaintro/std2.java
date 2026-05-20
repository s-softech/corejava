package com.javaintro;

public class std2 {
	    std2 s;


	@Override
	protected void finalize() {
		System.out.println("Strudent object finalize is called before destroying by garbage collector");
	}

	public void display() {
		System.out.println("printed");
	}

	public static void main(String[] args) {
		std2 s1 = new std2();
		std2 s2 = new std2();
		std2 s3 = new std2();
		s1.display();
		s2.display();
		s3.display();


		s1 .s = s3;
		s2 .s = s1;
		s3 .s = s2;
		s1 = null;
		s2 = null;
		s3 = null;
		System.gc();

	}

}
