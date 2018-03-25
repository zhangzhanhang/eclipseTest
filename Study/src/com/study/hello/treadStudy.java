package com.study.hello;

public class treadStudy implements Runnable {
	private String name;
	public treadStudy(String name){
		this.name=name;
	}
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(name+i);
		}
		System.out.println("as");
	}
}
