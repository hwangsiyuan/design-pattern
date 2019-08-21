package com.hussein.singleton;

/**
 * <p>Title: DoubleCheckSingleton</p>
 * <p>Description: 双重检查-线程安全单例</p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/21 3:54 PM
 */
public class DoubleCheckSingleton {

    private static DoubleCheckSingleton INSTANCE = null;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance(){
        if(INSTANCE == null){
            synchronized (DoubleCheckSingleton.class){
                if (INSTANCE == null){
                    INSTANCE = new DoubleCheckSingleton();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        DoubleCheckSingleton one = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton two = DoubleCheckSingleton.getInstance();
        System.out.println(one);
        System.out.println(two);
    }
}
