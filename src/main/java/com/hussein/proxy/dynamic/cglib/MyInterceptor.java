package com.hussein.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * <p>Title: MyInterceptor</p>
 * <p>Description: cglib</p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/23 2:04 PM
 */
public class MyInterceptor implements MethodInterceptor {

    private Object targetObject;

    public MyInterceptor(Object targetObject) {
        this.targetObject = targetObject;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = methodProxy.invoke(targetObject, objects);
        long end = System.currentTimeMillis();
        System.out.println("用时:" + (end - start) + "ms.");
        return result;
    }

    public Object getProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetObject.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }
}
