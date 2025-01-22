package com.part2;

import java.lang.reflect.Method;



public class Main {
	//part-2 solution
	public static void main(String[] args) {
		
		MyIncDec myIncDec = new MyIncDec(10);
         
		try {
			Method incrementMethod = MyIncDec.class.getMethod("increment");
			Method decrementMethod = MyIncDec.class.getMethod("decrement");

	        TimingInterceptor.time(myIncDec, incrementMethod, null);
	        TimingInterceptor.time(myIncDec, decrementMethod, null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
    }
}
