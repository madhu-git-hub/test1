package com.part2;

import com.part1.IncDec;

public class MyIncDec implements IncDec {

	private int x;

	public MyIncDec(int x) {
		this.x = x;
	}
	@Timed
	public void increment() {
		this.x++;
	}
	@Timed
	public void decrement() {
		this.x--;
	}
}
