package com.hussein.facade;

/**
 * <p>Title: Facade</p>
 * <p>Description: 外观模式</p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/22 3:52 PM
 */
public class Facade {

    private SubSystemOne systemOne;

    private SubSystemTwo systemTwo;

    private SubSystemThree systemThree;

    private SubSystemFour systemFour;

    public Facade() {
        systemOne = new SubSystemOne();
        systemTwo = new SubSystemTwo();
        systemThree = new SubSystemThree();
        systemFour = new SubSystemFour();
    }

    public void methodA(){
        System.out.println("================");
        systemOne.methodOne();
        systemThree.methodThree();
        systemFour.methodFour();
        System.out.println("================");
    }

    public void methodB(){
        System.out.println("*****************");
        systemTwo.methodTwo();
        systemFour.methodFour();
        System.out.println("*****************");
    }
}
