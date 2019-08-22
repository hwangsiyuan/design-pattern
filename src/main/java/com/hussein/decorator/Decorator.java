package com.hussein.decorator;

/**
 * <p>Title: Decorator</p>
 * <p>Description: 装饰者模式</p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/22 2:11 PM
 */
public class Decorator extends Component{

    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
