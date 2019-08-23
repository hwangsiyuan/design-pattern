package com.hussein.proxy.dynamic.spring;

import java.util.concurrent.TimeUnit;

/**
 * <p>Title: Hello</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/23 4:37 PM
 */
public class Hello {

    public String sayHello(String name) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello " + name);
        return name;
    }
}
