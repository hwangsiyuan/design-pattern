package com.hussein.singleton;

/**
 * <p>Title: HungryEnumSingleton</p>
 * <p>Description: 饿汉枚举单例</p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/21 4:16 PM
 */
public enum  HungryEnumSingleton {

    //默认实例
    INSTANCE;

    public static HungryEnumSingleton getInstance(){
        return  INSTANCE;
    }

    public static void main(String[] args) {
        HungryEnumSingleton one = HungryEnumSingleton.getInstance();
        HungryEnumSingleton two = HungryEnumSingleton.getInstance();
        System.out.println(one);
        System.out.println(two);
    }
}
