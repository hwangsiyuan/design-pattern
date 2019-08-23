package com.hussein.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * <p>Title: LogHandler</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/23 10:34 AM
 */
public class LogHandler implements InvocationHandler {

    private Object targetObject;

    public LogHandler(Object targetObject) {
        this.targetObject = targetObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String threadName = Thread.currentThread().getName();
        int parameterCount = method.getParameterCount();
        System.out.println("[" + threadName + "]" + "请求方法:" + targetObject.getClass().getName() + "." + method.getName());
        if (parameterCount > 0) {
            System.out.print("[" + threadName + "]" + "请求参数:");
            Arrays.stream(args).forEach(System.out::print);
            System.out.println();
        }
        Object result = null;
        try {
            result = method.invoke(targetObject, args);
            System.out.println("[" + threadName + "]" + "结果:" + result);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("[" + threadName + "]" + "错误:" + e.getMessage());
        }
        return result;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
    }
}
