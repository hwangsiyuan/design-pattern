package com.hussein.builder;

/**
 * <p>Title: ConcreteBuilder</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/21 2:50 PM
 */
public class ConcreteBuilder implements Builder {

    private Product product = new Product();

    @Override
    public void buildFirstPart() {
        product.add("组装第一部分");
    }

    @Override
    public void buildSecondPart() {
        product.add("组装第二部分");
    }

    @Override
    public Product build() {
        buildFirstPart();
        buildSecondPart();
        return product;
    }
}
