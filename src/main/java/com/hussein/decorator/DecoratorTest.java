package com.hussein.decorator;

/**
 * <p>Title: DecoratorTest</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/22 3:10 PM
 */
public class DecoratorTest {

    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecorator1 decorator1 = new ConcreteDecorator1();
        ConcreteDecorator2 decorator2 = new ConcreteDecorator2();
        decorator1.setComponent(component);
        decorator2.setComponent(decorator1);
        decorator2.operation();
    }
}
