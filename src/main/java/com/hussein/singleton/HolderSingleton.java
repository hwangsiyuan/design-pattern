package com.hussein.singleton;

/**
 * <p>Title: HolderSingleton</p>
 * <p>Description: Holder方式单例</p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/21 3:57 PM
 */
public class HolderSingleton {

    private HolderSingleton() {
    }

    private static class Holder {

        private static final HolderSingleton INSTANCE = new HolderSingleton();
    }

    public static HolderSingleton getInstance() {
        return Holder.INSTANCE;
    }

    public static void main(String[] args) {
        HolderSingleton one = HolderSingleton.getInstance();
        HolderSingleton two = HolderSingleton.getInstance();
        System.out.println(one);
        System.out.println(two);
    }
}
