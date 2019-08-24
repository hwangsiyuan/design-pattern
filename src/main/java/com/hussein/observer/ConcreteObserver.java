package com.hussein.observer;

/**
 * <p>Title: ConcreteObserver</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 4:52 PM
 */
public class ConcreteObserver implements Observer {

    private String name;

    private ConcreteSubject subject;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.printf("观察者[%s]的状态更新为[%s]\n", name, subject.getState());
    }
}
