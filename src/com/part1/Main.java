package com.part1;

public class Main {
	public static void main(String[] args) {
		//Part-1 solution
        IncDec myIncDec = new MyIncDec(10);
        IncDec solution = new Solution(myIncDec);

        solution.increment();
        solution.decrement();
    }
}
