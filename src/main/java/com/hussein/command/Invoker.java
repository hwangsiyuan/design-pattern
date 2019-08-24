package com.hussein.command;

/**
 * <p>Title: Invoker</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 11:48 AM
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
