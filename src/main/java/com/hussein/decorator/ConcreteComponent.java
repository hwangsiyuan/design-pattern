package com.hussein.decorator;

/**
 * <p>Title: ConcreteComponent</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/22 2:13 PM
 */
public class ConcreteComponent extends Component {

    @Override
    public void operation() {
        System.out.println("具体的操作");
    }
}
