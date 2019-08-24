package com.hussein.chain;

/**
 * <p>Title: ChainTest</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 11:24 AM
 */
public class ChainTest {

    public static void main(String[] args) {
        ConcreteHandlerOne one = new ConcreteHandlerOne();
        ConcreteHandlerTwo two = new ConcreteHandlerTwo();
        ConcreteHandlerThree three = new ConcreteHandlerThree();
        one.setSuccssor(two);
        two.setSuccssor(three);
        one.handlerRequest(5);
        one.handlerRequest(15);
        one.handlerRequest(25);
    }
}
