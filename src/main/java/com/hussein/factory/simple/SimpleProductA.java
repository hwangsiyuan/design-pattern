package com.hussein.factory.simple;

/**
 * <p>Title: SimpleProductA</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/20 3:33 PM
 */
public class SimpleProductA implements ISimpleProduct {

    @Override
    public void createProduct() {
        System.out.println("A is created.");
    }
}
