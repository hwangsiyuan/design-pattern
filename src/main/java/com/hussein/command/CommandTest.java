package com.hussein.command;

/**
 * <p>Title: CommandTest</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 11:49 AM
 */
public class CommandTest {

    public static void main(String[] args) {
        Invoker invoker = new Invoker(new ConcreteCommand(new Receiver()));
        invoker.executeCommand();
    }
}
