package com.hussein.interpreter;

/**
 * <p>Title: NonTerminalExpression</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 10:46 AM
 */
public class NonTerminalExpression implements Expression {

    @Override
    public void interpret(Context context) {
        System.out.printf("非终端[%s][%s]\n", context.getInput().toUpperCase(), context.getOutput().toUpperCase());
    }
}
