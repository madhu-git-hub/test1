package com.part1;

public class Solution implements IncDec {
	private IncDec incDec;

    public Solution(IncDec incDec) {
        this.incDec = incDec;
    }

    @Override
    public void increment() {
        long start = System.currentTimeMillis();
        incDec.increment();
        try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        long end = System.currentTimeMillis();
        System.out.println("Increment took " + (end - start) + " ms");
    }

    @Override
    public void decrement() {
        long start = System.currentTimeMillis();
        incDec.decrement();
        long end = System.currentTimeMillis();
        System.out.println("Decrement took " + (end - start) + " ms");
    }
    
    
    
}
