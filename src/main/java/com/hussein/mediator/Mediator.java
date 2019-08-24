package com.hussein.mediator;

/**
 * <p>Title: Mediator</p>
 * <p>Description: 中介者模式</p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 3:56 PM
 */
public interface Mediator {

    /**
     * 中介发送消息
     *
     * @param colleague 同事
     * @param message   消息
     */
    void sendMessage(Colleague colleague, String message);
}
