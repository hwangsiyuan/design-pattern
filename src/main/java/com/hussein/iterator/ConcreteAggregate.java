package com.hussein.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: ConcreteAggregate</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 1:55 PM
 */
public class ConcreteAggregate<T> implements Aggregate<T> {

    private List<T> itemList = new ArrayList<>();

    public ConcreteAggregate(List<T> itemList) {
        this.itemList = itemList;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public T getFirstItem() {
        return itemList.get(0);
    }

    @Override
    public T getItem(int current) {
        return itemList.get(current);
    }

    @Override
    public int getCount() {
        return itemList.size();
    }
}
