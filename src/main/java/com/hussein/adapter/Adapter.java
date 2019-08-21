package com.hussein.adapter;

/**
 * <p>Title: Adapter</p>
 * <p>Description: 适配器模式</p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/21 4:58 PM
 */
public class Adapter extends Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.request();
    }
}
