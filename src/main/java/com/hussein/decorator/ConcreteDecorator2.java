package com.hussein.decorator;

/**
 * <p>Title: ConcreteDecorator2</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/22 3:02 PM
 */
public class ConcreteDecorator2 extends Decorator {

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void addedBehavior() {
    }
}
