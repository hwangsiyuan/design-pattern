package com.hussein.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: ObjectStructure</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 6:04 PM
 */
public class ObjectStructure {

    private List<Element> elementList = new ArrayList<>();

    public void attach(Element element) {
        elementList.add(element);
    }

    public void detach(Element element) {
        elementList.remove(element);
    }

    public void accept(Visitor visitor) {
        elementList.forEach(e -> e.accept(visitor));
    }
}
