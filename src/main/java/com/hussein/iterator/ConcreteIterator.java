package com.hussein.iterator;

/**
 * <p>Title: ConcreteIterator</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 1:52 PM
 */
public class ConcreteIterator<T> implements Iterator<T> {

    private Aggregate<T> aggregate;

    private int current;

    public ConcreteIterator(Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public T first() {
        return aggregate.getFirstItem();
    }

    @Override
    public T next() {
        return aggregate.getItem(current++);
    }

    @Override
    public boolean isDone() {
        return current >= aggregate.getCount();
    }

    @Override
    public T currentItem() {
        return aggregate.getItem(current);
    }
}
