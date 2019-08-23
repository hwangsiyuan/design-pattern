package com.hussein.proxy.dynamic.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>Title: SpringAopTest</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/23 7:12 PM
 */
public class SpringAopTest {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/aop.xml");
        Hello hello = (Hello) ac.getBean("hello");
        hello.sayHello("Kitty");
        hello.error();
    }
}
