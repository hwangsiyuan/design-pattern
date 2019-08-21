package com.hussein.singleton;

/**
 * <p>Title: HungrySingleton</p>
 * <p>Description: 饿汉模式-单例</p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/21 3:44 PM
 */
public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        HungrySingleton one = HungrySingleton.getInstance();
        HungrySingleton two = HungrySingleton.getInstance();
        System.out.println(one);
        System.out.println(two);
    }
}
