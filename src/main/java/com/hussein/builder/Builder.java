package com.hussein.builder;

/**
 * <p>Title: Builder</p>
 * <p>Description: 建造者模式</p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/21 2:46 PM
 */
public interface Builder {

    void buildFirstPart();

    void buildSecondPart();

    Product build();
}
