package com.hussein.momento;

/**
 * <p>Title: MementoTest</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 4:35 PM
 */
public class MementoTest {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("On");
        originator.show();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.setState("Off");
        originator.show();
        originator.setMemento(caretaker.getMemento());
        originator.show();
    }
}
