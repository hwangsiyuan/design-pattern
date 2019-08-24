package com.hussein.state;

/**
 * <p>Title: StateOne</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 5:17 PM
 */
public class StateOne implements State{

    @Override
    public void handler(Context context) {
        context.setState(new StateTwo());
    }
}
