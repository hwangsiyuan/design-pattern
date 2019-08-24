package com.hussein.state;

/**
 * <p>Title: StateTwo</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 5:17 PM
 */
public class StateTwo implements State{
    
    @Override
    public void handler(Context context) {
        context.setState(new StateOne());
    }
}
