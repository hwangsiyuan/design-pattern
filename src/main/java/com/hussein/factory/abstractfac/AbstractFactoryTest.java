package com.hussein.factory.abstractfac;

/**
 * <p>Title: AbstractFactoryTest</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/20 5:28 PM
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        ConcreteFactory1 factory1 = new ConcreteFactory1();
        factory1.createProductA();
        factory1.createProductB();
        ConcreteFactory2 factory2 = new ConcreteFactory2();
        factory2.createProductA();
        factory2.createProductB();
    }
}
