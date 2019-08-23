package com.hussein.proxy.statics;

/**
 * <p>Title: RealSubject</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/23 10:24 AM
 */
public class RealSubject extends Subject {

    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
