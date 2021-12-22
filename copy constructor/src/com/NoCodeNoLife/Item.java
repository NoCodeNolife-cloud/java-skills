package com.NoCodeNoLife;

public class Item {

    private int value;

    int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Item(int value) {
        setValue(value);
    }

    public Item(Item item) {
        int val = item.getValue();
        setValue(val);
    }

    @Override
    public String toString() {
        return "Item{" +
                "value=" + value +
                '}';
    }
}
