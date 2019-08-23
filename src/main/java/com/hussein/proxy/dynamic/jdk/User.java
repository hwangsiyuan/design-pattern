package com.hussein.proxy.dynamic.jdk;

/**
 * <p>Title: User</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/23 10:47 AM
 */
public interface User {

    void add(String name, int age);

    void update(String name, int age);

    boolean delete(String name);
}
