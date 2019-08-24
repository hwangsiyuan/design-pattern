package com.hussein.strategy;

/**
 * <p>Title: Context</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 5:40 PM
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextAlgorithm() {
        strategy.algorithm();
    }
}
