package com.hussein.builder;

/**
 * <p>Title: Director</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/21 2:52 PM
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildFirstPart();
        builder.buildSecondPart();
        System.out.println(builder.build());
    }
}
