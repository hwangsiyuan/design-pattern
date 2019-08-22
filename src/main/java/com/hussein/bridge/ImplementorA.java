package com.hussein.bridge;

/**
 * <p>Title: ImplementorA</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/22 11:02 AM
 */
public class ImplementorA implements Implementor {

    @Override
    public void operation() {
        System.out.println("A 操作");
    }
}
