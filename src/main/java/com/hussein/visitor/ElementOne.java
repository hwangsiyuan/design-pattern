package com.hussein.visitor;

/**
 * <p>Title: ElementOne</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 5:58 PM
 */
public class ElementOne implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementOne(this);
    }
}
