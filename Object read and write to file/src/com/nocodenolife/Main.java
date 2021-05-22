package com.nocodenolife;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) throws IOException {

        // 写入文件
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String ID = scanner.next();
        int age = scanner.nextInt();
        String specialty = scanner.next();

        File file = new File("src/com/nocodenolife/save.txt");// 定位文件
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        Student student = new Student(name, ID, age, specialty);// 写入对象

        objectOutputStream.writeObject(student);// 写入文件

        name = scanner.next();
        ID = scanner.next();
        age = scanner.nextInt();
        specialty = scanner.next();
        student = new Student(name, ID, age, specialty);

        objectOutputStream.writeObject(student);// 写入文件

        objectOutputStream.close();// 关闭

        // 读出数据
        FileInputStream inputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);


        Vector<Student> student1 = new Vector<>();

        Student tmp = new Student();
        try {

            while ((tmp = (Student) objectInputStream.readObject()) != null) {

                student1.add(tmp);
            }
        } catch (IOException | ClassNotFoundException ignored) {

        }

        for (Student item : student1) {

            System.out.println(item.toString());
        }
    }
}
