package com.hussein.state;

/**
 * <p>Title: StateTest</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 5:20 PM
 */
public class StateTest {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new StateOne());
        context.request();
        context.request();
        context.request();
        context.request();
    }
}
