package com.hussein.proxy.dynamic.jdk;

/**
 * <p>Title: UserImpl</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/23 11:02 AM
 */
public class UserImpl implements User {

    @Override
    public void add(String name, int age) {
        System.out.println("增加用户");
    }

    @Override
    public void update(String name, int age) {
        System.out.println("修改用户");
    }

    @Override
    public boolean delete(String name) {
        System.out.println("删除用户");
        return true;
    }
}
