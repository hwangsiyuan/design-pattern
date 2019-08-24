package com.hussein.chain;

/**
 * <p>Title: ConcreteHandlerTwo</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 11:19 AM
 */
public class ConcreteHandlerTwo extends Handler {

    @Override
    public void handlerRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("ConcreteHandlerTwo handler request " + request);
        } else if (successor != null) {
            successor.handlerRequest(request);
        }
    }

}
