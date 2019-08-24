package com.hussein.interpreter;

/**
 * <p>Title: Expression</p>
 * <p>Description: 解释器模式</p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 10:43 AM
 */
public interface Expression {

    void interpret(Context context);
}
