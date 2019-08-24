package com.hussein.observer;

/**
 * <p>Title: ObserverTest</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 4:55 PM
 */
public class ObserverTest {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver("A", subject));
        subject.attach(new ConcreteObserver("B", subject));
        subject.attach(new ConcreteObserver("C", subject));
        subject.setState("Ok");
        subject.notifyObserver();
    }
}
