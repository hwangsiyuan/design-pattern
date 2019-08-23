package com.hussein.proxy.dynamic.spring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;

/**
 * <p>Title: Advices</p>
 * <p>Description: Aop动态代理</p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/23 5:30 PM
 */
public class Advices {

    public void before(JoinPoint jp) {
        System.out.println("------------------------before--------------------------");
        System.out.println("方法名" + jp.getSignature() + ",参数" + Arrays.toString(jp.getArgs()) + ",代理对象:" + jp.getTarget().getClass().getName());
    }

    public void after(JoinPoint jp) {
        System.out.println("------------------------after---------------------------");
    }

    public void afterReturning(JoinPoint jp, Object result) {
        System.out.println("方法名" + jp.getSignature() + ",结果:" + result);
    }

    public void afterThrowing(JoinPoint jp, Exception e) {
        e.printStackTrace();
        System.out.println("方法名" + jp.getSignature() + ",异常:" + e.getMessage());
    }

    public Object around(ProceedingJoinPoint pjp){
        System.out.println("----------------------around before------------------------");
        System.out.println("方法名" + pjp.getSignature() + ",参数" + Arrays.toString(pjp.getArgs()) + ",代理对象:" + pjp.getTarget().getClass().getName());
        Object result = null;
        try {
            result = pjp.proceed();
            System.out.println("方法名" + pjp.getSignature() + ",结果:" + result);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("方法名" + pjp.getSignature() + ",异常:" + throwable.getMessage());
        }
        System.out.println("----------------------around after-------------------------");
        return result;
    }

}
