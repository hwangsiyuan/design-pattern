package com.hussein.singleton;

/**
 * <p>Title: LazyEnumSingleton</p>
 * <p>Description: 懒汉枚举单例</p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/21 4:08 PM
 */
public class LazyEnumSingleton {

    private LazyEnumSingleton() {
    }

    enum SingleEnum{
        //默认示例
        INSTANCE;

        private LazyEnumSingleton singleton;

        SingleEnum() {
            singleton = new LazyEnumSingleton();
        }

        public LazyEnumSingleton getSingleton() {
            return singleton;
        }
    }

    public static LazyEnumSingleton getInstance(){
        return SingleEnum.INSTANCE.getSingleton();
    }

    public static void main(String[] args) {
        LazyEnumSingleton one = LazyEnumSingleton.getInstance();
        LazyEnumSingleton two = LazyEnumSingleton.getInstance();
        System.out.println(one);
        System.out.println(two);
    }

}
