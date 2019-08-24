package com.hussein.visitor;

/**
 * <p>Title: ConcreteVisitorTwo</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 6:01 PM
 */
public class ConcreteVisitorTwo implements Visitor {

    @Override
    public void visitElementOne(ElementOne elementOne) {
        System.out.printf("[%s]被[%s]访问\n", elementOne.getClass().getName(), this.getClass().getName());
    }

    @Override
    public void visitElementTwo(ElementTwo elementTwo) {
        System.out.printf("[%s]被[%s]访问\n", elementTwo.getClass().getName(), this.getClass().getName());

    }
}
