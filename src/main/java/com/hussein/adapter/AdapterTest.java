package com.hussein.adapter;

/**
 * <p>Title: AdapterTest</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/21 5:00 PM
 */
public class AdapterTest {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
