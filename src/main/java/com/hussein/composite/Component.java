package com.hussein.composite;

/**
 * <p>Title: Component</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/22 12:04 PM
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    /**
     * 增加节点
     * @param c
     */
    abstract void add(Component c);

    /**
     * 删除节点
     * @param c
     */
    abstract void remove(Component c);

    /**
     * 展示
     * @param dept
     */
    abstract void display(int dept);
}
