package com.hussein.bridge;

/**
 * <p>Title: Abstraction</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/22 11:47 AM
 */
public abstract class Abstraction {

    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    abstract void operation();
}
