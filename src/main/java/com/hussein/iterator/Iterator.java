package com.hussein.iterator;

/**
 * <p>Title: Iterator</p>
 * <p>Description: 迭代器模式</p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 1:45 PM
 */
public interface Iterator<T> {

    T first();

    T next();

    boolean isDone();

    T currentItem();
}
