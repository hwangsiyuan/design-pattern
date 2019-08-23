package com.hussein.proxy.dynamic.cglib;

import java.util.concurrent.TimeUnit;

/**
 * <p>Title: Hello</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/23 2:26 PM
 */
public class Hello {

    public void sayHello(String name) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("hello %s\n", name);
    }
}
