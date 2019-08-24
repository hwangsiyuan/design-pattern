package com.hussein.chain;

/**
 * <p>Title: Handler</p>
 * <p>Description: 职责链模式</p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 11:14 AM
 */
public abstract class Handler {

    protected Handler successor;

    abstract void handlerRequest(int request);

    public void setSuccssor(Handler handler) {
        successor = handler;
    }
}
