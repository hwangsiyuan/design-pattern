package com.hussein.prototype;

/**
 * <p>Title: ConcretePrototype</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/21 3:15 PM
 */
public class ConcretePrototype implements Prototype {

    private String type;

    private Item item;

    public ConcretePrototype(String type, Item item) {
        this.type = type;
        this.item = item;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "type='" + type + '\'' +
                ", item=" + item +
                '}';
    }

    @Override
    public Object clone() {
        return new ConcretePrototype(type, (Item) item.clone());
    }

    public static class Item implements Prototype {

        private String name;

        private String value;

        public Item(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public Object clone() {
            return new Item(name, value);
        }

        @Override
        public String toString() {
            return "Item{" +
                    "name='" + name + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }
    }
}
