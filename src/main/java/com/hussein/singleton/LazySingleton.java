package com.hussein.singleton;

/**
 * <p>Title: LazySingleton</p>
 * <p>Description: 懒汉模式-存在线程安全问题</p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/21 3:51 PM
 */
public class LazySingleton {

    private static LazySingleton INSTANCE = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        LazySingleton one = LazySingleton.getInstance();
        LazySingleton two = LazySingleton.getInstance();
        System.out.println(one);
        System.out.println(two);
    }
}
