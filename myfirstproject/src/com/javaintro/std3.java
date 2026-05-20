package com.javaintro;

public class std3 {
	std3 t;
	void show() {
		System.out.println("gc colled" );
	}

	public static void main(String[] args) {
		std3 s1 = new std3();
		std3 s2 = new std3();
		new std3().show();
		System.gc();

	}

}
