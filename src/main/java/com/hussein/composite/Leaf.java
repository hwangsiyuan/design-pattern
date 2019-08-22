package com.hussein.composite;

/**
 * <p>Title: Leaf</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/22 12:06 PM
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    void add(Component c) {
        System.out.println("cannot add to a leaf");
    }

    @Override
    void remove(Component c) {
        System.out.println("cannot remove from a leaf");
    }

    @Override
    void display(int dept) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < dept; i++) {
            builder.append("-");
        }
        System.out.println(builder.toString() + name);
    }
}
