package com.hussein.iterator;

/**
 * <p>Title: Aggregate</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 1:54 PM
 */
public interface Aggregate<T> {

    Iterator<T> createIterator();

    T getFirstItem();

    T getItem(int current);

    int getCount();
}
