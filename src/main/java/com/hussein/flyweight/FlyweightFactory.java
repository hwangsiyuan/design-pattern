package com.hussein.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title: FlyweightFactory</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/22 5:39 PM
 */
public class FlyweightFactory {

    private Map<String, Flyweight> flyweightMap = new HashMap<>();

    public FlyweightFactory() {
        this.flyweightMap.put("A", new ConcreteFlyweight());
        this.flyweightMap.put("B", new ConcreteFlyweight());
        this.flyweightMap.put("C", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        return this.flyweightMap.get(key);
    }
}
