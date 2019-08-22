package com.hussein.bridge;

/**
 * <p>Title: RefinedAbstraction</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/22 11:48 AM
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    void operation() {
        implementor.operation();
    }
}
