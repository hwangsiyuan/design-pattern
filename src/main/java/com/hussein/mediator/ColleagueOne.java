package com.hussein.mediator;

/**
 * <p>Title: ColleagueOne</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 4:03 PM
 */
public class ColleagueOne extends Colleague {

    public void send(String message) {
        mediator.sendMessage(this, message);
    }

    @Override
    public void notify(String message) {
        System.out.println("同事1收到消息:" + message);
    }
}
