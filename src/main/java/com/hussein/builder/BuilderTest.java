package com.hussein.builder;

/**
 * <p>Title: BuilderTest</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/21 2:56 PM
 */
public class BuilderTest {

    public static void main(String[] args) {
        new Director(new ConcreteBuilder()).construct();
    }
}
