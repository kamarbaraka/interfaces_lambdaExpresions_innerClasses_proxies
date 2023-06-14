/*
 * Copyright (c) 2023
 * This program is released under the gpl license
 */

package proxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

public class TrackingHandler
        implements InvocationHandler {

    private Object target;

    public TrackingHandler(Object target){
        this.target = target;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //printout the call
        System.out.printf("%s.%s(",
                this.target, method.getName()
                );
        for (int i = 0; i < args.length; i++) {
            System.out.printf("%s", args[i]);
            if (i < args.length - 1)
                System.out.print(",");
            System.out.println(")");
        }

        return method.invoke(target, args);
    }

    public static void main(String... args){

        var proxyElements = new Object[1000];

        for (int i = 0; i < proxyElements.length; i++){
            var value = i+1;
            var handler = new TrackingHandler(value);
            var proxy = Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] {Comparable.class},
                    handler);
            proxyElements[i] = proxy;
        }

        var key = new Random().nextInt(0, 1000);
        var result = Arrays.binarySearch(proxyElements, key);
        if (result >= 0) System.out.println(proxyElements[result]);
    }
}
