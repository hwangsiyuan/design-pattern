package com.hussein.bridge;

/**
 * <p>Title: BridgeTest</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/22 11:49 AM
 */
public class BridgeTest {

    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction(new ImplementorA());
        abstraction.operation();
    }
}
