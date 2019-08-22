package com.hussein.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: Composite</p>
 * <p>Description: 组合模式 常用用树状结构</p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/22 12:11 PM
 */
public class Composite extends Component {

    private final List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    void add(Component c) {
        children.add(c);
    }

    @Override
    void remove(Component c) {
        children.remove(c);
    }

    @Override
    void display(int dept) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < dept; i++) {
            builder.append("-");
        }
        System.out.println(builder.toString() + name);
        children.forEach(c -> c.display(dept + 2));
    }
}
