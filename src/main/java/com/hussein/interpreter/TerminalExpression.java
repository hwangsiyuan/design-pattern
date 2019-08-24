package com.hussein.interpreter;

/**
 * <p>Title: TerminalExpression</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 10:46 AM
 */
public class TerminalExpression implements Expression {

    @Override
    public void interpret(Context context) {
        System.out.printf("终端[%s][%s]\n", context.getInput().toLowerCase(), context.getOutput().toLowerCase());
    }
}
