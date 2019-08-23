package com.hussein.proxy.dynamic.spring;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Arrays;

/**
 * <p>Title: SurroundAdvice</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/23 4:22 PM
 */
public class SurroundAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("开始调用方法" + mi.getThis().getClass().getName() + "." + mi.getMethod().getName() + "，参数:" + Arrays.toString(mi.getArguments()));
        Object result = mi.proceed();
        System.out.println("方法结束，用时:" + (System.currentTimeMillis() - start) + "ms,返回值:" + result);
        return result;
    }
}
