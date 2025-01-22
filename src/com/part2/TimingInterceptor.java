package com.part2;
import java.lang.reflect.Method;

public class TimingInterceptor {

    public static void time(Object obj, Method method, Object[] args) throws Exception {
        if (method.isAnnotationPresent(Timed.class)) {
            long start = System.currentTimeMillis();
            method.invoke(obj, args);
            long end = System.currentTimeMillis();
            System.out.println(method.getName() + " took " + (end - start) + " ms");
        } else {
            method.invoke(obj, args);
        }
    }
}