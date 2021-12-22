package com.NoCodeNoLife;

public class Main {
    
    public static void main(String[] args) {
        Item item = new Item(5);
        Bag bag = new Bag(item);
        Bag another = new Bag(bag);
        item.setValue(25);
        System.out.println(another);
    }
}
