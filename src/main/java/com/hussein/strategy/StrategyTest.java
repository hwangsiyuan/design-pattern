package com.hussein.strategy;

/**
 * <p>Title: StrategyTest</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 5:43 PM
 */
public class StrategyTest {

    public static void main(String[] args) {
        Context context = new Context(new StrategyOne());
        context.contextAlgorithm();
        context = new Context(new StrategyTwo());
        context.contextAlgorithm();
        context = new Context(new StrategyThree());
        context.contextAlgorithm();
    }
}
