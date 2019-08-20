package com.hussein.factory.method;

/**
 * <p>Title: FactoryMethodTest</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/20 4:34 PM
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        IFactory factory = new AFactory();
        factory.createProduct();
        factory = new BFactory();
        factory.createProduct();
    }
}
