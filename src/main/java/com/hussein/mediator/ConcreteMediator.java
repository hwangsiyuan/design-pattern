package com.hussein.mediator;

/**
 * <p>Title: ConcreteMediator</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 4:02 PM
 */
public class ConcreteMediator implements Mediator {

    private ColleagueOne one;

    private ColleagueTwo two;

    public ConcreteMediator(ColleagueOne one, ColleagueTwo two) {
        this.one = one;
        this.two = two;
    }

    @Override
    public void sendMessage(Colleague colleague, String message) {
        if (one == colleague) {
            two.notify(message);
        }
        if (two == colleague) {
            one.notify(message);
        }
    }
}
