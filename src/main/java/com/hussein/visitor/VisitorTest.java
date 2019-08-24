package com.hussein.visitor;

/**
 * <p>Title: VisitorTest</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 6:07 PM
 */
public class VisitorTest {

    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.attach(new ElementOne());
        os.attach(new ElementTwo());
        ConcreteVisitorOne vo = new ConcreteVisitorOne();
        ConcreteVisitorTwo vt = new ConcreteVisitorTwo();
        os.accept(vo);
        os.accept(vt);
    }
}
