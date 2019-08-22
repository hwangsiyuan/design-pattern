package com.hussein.composite;

/**
 * <p>Title: CompositeTest</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/22 12:14 PM
 */
public class CompositeTest {

    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("leafA"));
        root.add(new Leaf("leafB"));
        Composite composite = new Composite("compositeC");
        composite.add(new Leaf("leafD"));
        composite.add(new Leaf("leafE"));
        root.add(composite);
        root.display(2);
    }
}
