package com.hussein.flyweight;

/**
 * <p>Title: ConcreteFlyweight</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/22 5:28 PM
 */
public class ConcreteFlyweight extends Flyweight {

    @Override
    void operation(int extrinsicState) {
        System.out.println("具体Flyweight" + extrinsicState);
    }
}
