package com.hussein.factory.abstractfac;

/**
 * <p>Title: AbstractFactoryEnhance</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/20 5:35 PM
 */
public class AbstractFactoryEnhance implements IFactory {

    private int type;

    public AbstractFactoryEnhance(int type) {
        this.type = type;
    }

    @Override
    public IProductA createProductA() {
        IProductA productA = null;
        switch (type) {
            case 1:
                productA = new ProductA1();
                break;
            case 2:
                productA = new ProductA2();
                break;
            default:
        }
        return productA;
    }

    @Override
    public IProductB createProductB() {
        IProductB productB = null;
        switch (type) {
            case 1:
                productB = new ProductB1();
                break;
            case 2:
                productB = new ProductB2();
                break;
            default:
        }
        return productB;
    }
}
