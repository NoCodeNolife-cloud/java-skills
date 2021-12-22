package com.NoCodeNoLife;

public class Bag {

    private Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Bag(Item item) {
        setItem(item);
    }

    public Bag(Bag bag) {
        Item it = new Item(bag.getItem());
        setItem(it);
    }

    @Override
    public String toString() {
        return "Bag{" +
                "item=" + item +
                '}';
    }
}
