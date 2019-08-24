package com.hussein.mediator;

/**
 * <p>Title: Colleague</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 3:57 PM
 */
public abstract class Colleague {

    protected Mediator mediator;

    public abstract void notify(String message);

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
