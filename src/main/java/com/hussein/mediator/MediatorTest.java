package com.hussein.mediator;

/**
 * <p>Title: MediatorTest</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 4:08 PM
 */
public class MediatorTest {

    public static void main(String[] args) {
        ColleagueOne one = new ColleagueOne();
        ColleagueTwo two = new ColleagueTwo();
        Mediator mediator = new ConcreteMediator(one, two);
        one.setMediator(mediator);
        two.setMediator(mediator);
        one.send("吃饭了吗");
        two.send("刚吃过");
    }
}
