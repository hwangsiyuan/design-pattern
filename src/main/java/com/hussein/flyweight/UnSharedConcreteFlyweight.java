package com.hussein.flyweight;

/**
 * <p>Title: UnSharedConcreteFlyweight</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/22 5:28 PM
 */
public class UnSharedConcreteFlyweight extends Flyweight {

    @Override
    void operation(int extrinsicState) {
        System.out.println("不共享的具体Flyweight" + extrinsicState);
    }
}
