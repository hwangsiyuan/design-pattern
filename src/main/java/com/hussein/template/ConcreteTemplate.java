package com.hussein.template;

/**
 * <p>Title: ConcreteTemplate</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 11:00 AM
 */
public class ConcreteTemplate extends Template{

    @Override
    protected void firstOperation() {
        System.out.println("第一个操作");
    }

    @Override
    protected void secondOperation() {
        System.out.println("第二个操作");
    }

    @Override
    protected void thirdOperation() {
        System.out.println("第三个操作");    }
}
