package com.hussein.visitor;

/**
 * <p>Title: Element</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 5:55 PM
 */
public interface Element {

    void accept(Visitor visitor);
}
