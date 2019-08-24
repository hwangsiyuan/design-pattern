package com.hussein.chain;

/**
 * <p>Title: ConcreteHandlerThree</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 11:19 AM
 */
public class ConcreteHandlerThree extends Handler {

    @Override
    public void handlerRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.println("ConcreteHandlerThree handler request " + request);
        } else if (successor != null) {
            successor.handlerRequest(request);
        }
    }

}
