package com.hussein.factory.method;

/**
 * <p>Title: IFactory</p>
 * <p>Description: 工厂方法</p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/20 4:23 PM
 */
public interface IFactory {

    /**
     * 创建产品
     *
     * @return 产品
     */
    IProduct createProduct();
}
