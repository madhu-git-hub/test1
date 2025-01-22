package com.part1;

import com.part2.Timed;

public class MyIncDec implements IncDec {

	private int x;

	public MyIncDec(int x) {
		this.x = x;
	}

	
	public void increment() {
		this.x++;
	}

	
	public void decrement() {
		this.x--;
	}
}
