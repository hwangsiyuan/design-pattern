package com.hussein.flyweight;

/**
 * <p>Title: FlyweightTest</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/22 5:42 PM
 */
public class FlyweightTest {

    public static void main(String[] args) {
        int extrinsicState = 22;
        FlyweightFactory fwf = new FlyweightFactory();
        Flyweight af = fwf.getFlyweight("A");
        af.operation(--extrinsicState);
        Flyweight bf = fwf.getFlyweight("B");
        bf.operation(--extrinsicState);
        Flyweight cf = fwf.getFlyweight("C");
        cf.operation(--extrinsicState);
        UnSharedConcreteFlyweight uscf = new UnSharedConcreteFlyweight();
        uscf.operation(--extrinsicState);
    }
}
