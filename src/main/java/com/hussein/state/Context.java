package com.hussein.state;

/**
 * <p>Title: Context</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 5:15 PM
 */
public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态为:" + state.getClass().getName());
    }

    public void request() {
        state.handler(this);
    }
}
