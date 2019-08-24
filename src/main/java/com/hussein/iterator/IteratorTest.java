package com.hussein.iterator;

import java.util.Arrays;

/**
 * <p>Title: IteratorTest</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/24 2:09 PM
 */
public class IteratorTest {

    public static void main(String[] args) {
        Iterator iterator = new ConcreteAggregate<>(Arrays.asList(1, 2, 3, "A")).createIterator();
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }
}
