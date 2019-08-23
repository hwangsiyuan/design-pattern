package com.hussein.proxy.statics;

/**
 * <p>Title: Proxy</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/23 10:25 AM
 */
public class Proxy extends Subject{

    private RealSubject realSubject = new RealSubject();

    @Override
    public void request() {
        realSubject.request();
    }
}
