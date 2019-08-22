package com.hussein.decorator;

/**
 * <p>Title: ConcreteDecorator1</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/22 3:02 PM
 */
public class ConcreteDecorator1 extends Decorator {

    private String addedState;

    @Override
    public void operation() {
        super.operation();
        addedState = "New state";
        System.out.println("具体装饰对象A的操作");
    }
}
