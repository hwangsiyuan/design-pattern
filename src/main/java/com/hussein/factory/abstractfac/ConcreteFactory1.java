package com.hussein.factory.abstractfac;

/**
 * <p>Title: ConcreteFactory1</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/20 5:02 PM
 */
public class ConcreteFactory1 implements IFactory {

    @Override
    public IProductA createProductA() {
       return new ProductA1();
    }

    @Override
    public IProductB createProductB() {
        return new ProductB1();
    }
}
