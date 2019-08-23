package com.hussein.proxy.dynamic.spring;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>Title: SpringAopTest</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/23 4:35 PM
 */
public class SpringAopTest {

    public static void main(String[] args) {
        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new BeforeAdvice());
        pf.addAdvice(new SurroundAdvice());
        pf.addAdvice(new AfterAdvice());
        pf.setTarget(new Hello());
        Hello proxy = (Hello) pf.getProxy();
        proxy.sayHello("Kitty");
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/ioc.xml");
        Hello helloProxy = (Hello) ac.getBean("proxy");
        helloProxy.sayHello("World");
    }
}
