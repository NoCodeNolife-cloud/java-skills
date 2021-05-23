package com.nocodenolife;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    public static void main(String[] args) throws IOException {

        // 调用createDirTree()方法，创建一个多级目录，用于测试
        createDirTree();

        // 创建FileVisitor的接口实现，重写FileVisitor的两个方法
        FileVisitor<Path> myFileVisitor = new SimpleFileVisitor<Path>() {
            // 需要传入参数Path和BasicFileAttributes，分别表示路径和属性对象
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {

                // 输出想要访问的目录名称
                System.out.println("将要访问的目录为: " + dir);
                return FileVisitResult.CONTINUE;
            }

            public FileVisitResult visitFile(Path file, BasicFileAttributes attributes) {

                System.out.println("正在访问的文件为: " + file + ",此文件的大小为: " + attributes.size());
                return FileVisitResult.CONTINUE;
            }
        };

        // 获取一个将要访问的目录路径的Path实例
        Path headDir = Paths.get("Dir1");

        // 通过walkFileTree方法，实现目录的遍历
        Files.walkFileTree(headDir, myFileVisitor);
    }

    private static void createDirTree() throws IOException {

        // 创建一个一级父目录，名为Dir1
        File headDir = new File("Dir1");
        headDir.mkdirs();
        headDir.deleteOnExit();

        // 在一级父目录下Dir1下，创建名为File.1的文件
        File myFile1 = new File(headDir, "File1.1");
        myFile1.createNewFile();
        myFile1.deleteOnExit();

        // 在一级父目录下Dir1下，创建一个名为Dir1。1的二级目录
        File mySubDirectory1 = new File(headDir, "Dir1.1");
        mySubDirectory1.mkdir();
        mySubDirectory1.deleteOnExit();

        // 在目录名为dir1.1的二级目录下，再创建一个文件，名为File1.1.1
        File myFile2 = new File(mySubDirectory1, "File1.1.1");
        myFile2.createNewFile();
        myFile2.deleteOnExit();

        // 在一级父目录Dir1下，创建一个目录名为Dir1。2的另一个二级目录
        File mySubDirectory2 = new File(headDir, "Dir1.2");
        mySubDirectory2.mkdir();
        mySubDirectory2.deleteOnExit();

        // 在二级父目录Dir1.2下，创建一个文件名为File1.2.1的文件
        File myFile3 = new File(mySubDirectory2, "File1.2.1");
        myFile3.createNewFile();
        myFile3.deleteOnExit();

        // 在二级父目录Dir1.2下，创建一个目录名为Dir1.2.1的三级目录
        File mySubDirectory3 = new File(mySubDirectory2, "Dir1.2.1");
        mySubDirectory3.mkdir();
        mySubDirectory3.deleteOnExit();

        // 在名为Dir1.2.1的三级目录下，创建一个名为File1.2.1.1的文件
        File myFile4 = new File(mySubDirectory3, "File1.2.1.1");
        myFile4.createNewFile();
        myFile4.deleteOnExit();
    }
}
