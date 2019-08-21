package com.hussein.prototype;

/**
 * <p>Title: PrototypeTest</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/21 3:20 PM
 */
public class PrototypeTest {

    public static void main(String[] args) {
        ConcretePrototype first = new ConcretePrototype("1", new ConcretePrototype.Item("A-key", "A-value"));
        System.out.println(first);
        ConcretePrototype second = (ConcretePrototype) first.clone();
        System.out.println(second);
        second.getItem().setName("B-key");
        second.getItem().setValue("B-value");
        System.out.println(first);
        System.out.println(second);
    }
}
