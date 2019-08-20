package com.hussein.factory.simple;

/**
 * <p>Title: SimpleFactory</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/20 3:31 PM
 */
public class SimpleFactory {

    public static ISimpleProduct getProduct(String name) {
        ISimpleProduct product = null;
        switch (name) {
            case "A":
                product = new SimpleProductA();
                break;
            case "B":
                product = new SimpleProductB();
                break;
            default:
        }
        return product;
    }

}
