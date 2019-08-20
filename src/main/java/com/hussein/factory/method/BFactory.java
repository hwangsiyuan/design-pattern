package com.hussein.factory.method;

/**
 * <p>Title: BFactory</p>
 * <p>Description: B工厂</p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/20 4:24 PM
 */
public class BFactory implements IFactory {
    @Override
    public IProduct createProduct() {
        return new BProduct();
    }
}
