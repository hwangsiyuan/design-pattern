package com.hussein.proxy.dynamic.cglib;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * <p>Title: CglibTest</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/23 2:28 PM
 */
public class CglibTest {

    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, System.getProperty("user.dir"));
        Hello hello = new Hello();
        MyInterceptor myInterceptor = new MyInterceptor(hello);
        Hello proxy = (Hello) myInterceptor.getProxy();
        proxy.sayHello("马纯上");
    }
}
