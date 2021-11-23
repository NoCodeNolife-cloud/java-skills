package com.NoCodeNoLife;

public class PassByValueExample {

    public static void main(String[] args) {
        Dog dog = new Dog("A");
        func(dog);
        System.out.println(dog.getName()); // B
    }

    private static void func(Dog dog) {
        dog.setName("B");
    }
}
