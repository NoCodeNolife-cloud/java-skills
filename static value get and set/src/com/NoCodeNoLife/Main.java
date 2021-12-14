package com.NoCodeNoLife;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();
        File file = new File("./res.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        fileWriter.write("the static final value is " + MyClass.staticFinalValue + '\n');
        fileWriter.write("the static value is " + MyClass.getStaticValue()+'\n');
        // printWriter.println("the static final value is " + MyClass.staticFinalValue);
        // printWriter.println("the static value is " + MyClass.getStaticValue());
        printWriter.close();
    }
}
