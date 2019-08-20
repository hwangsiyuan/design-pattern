package com.hussein.factory.simple;

/**
 * <p>Title: SimpleFactoryTest</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/20 3:52 PM
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        ISimpleProduct a = SimpleFactory.getProduct("A");
        a.createProduct();
        ISimpleProduct b = SimpleFactory.getProduct("B");
        b.createProduct();
    }
}
