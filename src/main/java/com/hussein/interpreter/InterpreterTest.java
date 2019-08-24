package com.hussein.interpreter;

/**
 * <p>Title: InterpreterTest</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 10:49 AM
 */
public class InterpreterTest {

    public static void main(String[] args) {
        Context context = new Context();
        context.setInput("Hello");
        context.setOutput("World");
        TerminalExpression te = new TerminalExpression();
        NonTerminalExpression nte = new NonTerminalExpression();
        te.interpret(context);
        nte.interpret(context);
    }
}
