package com.hussein.visitor;

/**
 * <p>Title: Visitor</p>
 * <p>Description: 访问者模式</p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 5:54 PM
 */
public interface Visitor {

    void visitElementOne(ElementOne elementOne);

    void visitElementTwo(ElementTwo elementTwo);
}
