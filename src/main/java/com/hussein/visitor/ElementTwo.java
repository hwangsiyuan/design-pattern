package com.hussein.visitor;

/**
 * <p>Title: ElementTwo</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 5:58 PM
 */
public class ElementTwo implements Element {
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementTwo(this);
    }
}
