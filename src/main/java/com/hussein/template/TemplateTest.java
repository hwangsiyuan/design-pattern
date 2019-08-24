package com.hussein.template;

/**
 * <p>Title: TemplateTest</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 11:02 AM
 */
public class TemplateTest {

    public static void main(String[] args) {
        Template template = new ConcreteTemplate();
        template.operation();
    }
}
