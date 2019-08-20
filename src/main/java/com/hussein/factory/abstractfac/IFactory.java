package com.hussein.factory.abstractfac;

/**
 * <p>Title: IFactory</p>
 * <p>Description: 抽象工厂</p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/20 5:01 PM
 */
public interface IFactory {

    /**
     * 生成A
     *
     * @return A
     */
    IProductA createProductA();

    /**
     * 生成B
     *
     * @return B
     */
    IProductB createProductB();
}
