package com.hussein.factory.method;

/**
 * <p>Title: AFactory</p>
 * <p>Description: A工厂</p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/20 4:24 PM
 */
public class AFactory implements IFactory {

    @Override
    public IProduct createProduct() {
        return new AProduct();
    }
}
