package com.hussein.chain;

/**
 * <p>Title: ConcreteHandlerOne</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 11:19 AM
 */
public class ConcreteHandlerOne extends Handler {

    @Override
    public void handlerRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println("ConcreteHandlerOne handler request " + request);
        } else if (successor != null) {
            successor.handlerRequest(request);
        }
    }

}
