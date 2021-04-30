package com.code;

public class Main {

    public static void main(String[] args) {
        Person student1 = new Student("Tom", 18, "清华大学");
        Person student2 = new Student("Ben", 28, "北京大学");
        Person student3 = new Student("Tony", 38, "香港大学");

        Person worker1 = new Worker("Tom", 18, "钢厂");
        Person worker2 = new Worker("Ben", 20, "电厂");

        Person people[] = {student1, student2, student3, worker1, worker2};

        int studentCount = 0;
        int workerCount = 0;

        for (Person item : people) {

            if (item instanceof Worker) {

                ++workerCount;
            } else if (item instanceof Student) {

                ++studentCount;
            }
        }

        System.out.printf("工人人数:%d,学生人数:%d", workerCount, studentCount);

        Person p1 = new Student("Tom", 18, "清华大学");
        Person p2 = new Worker("Tom", 18, "钢厂");

        Person p3 = new Person("Tony", 28);
        Student p4 = new Student("Ben", 40, "清华大学");
        Worker p5 = new Worker("Tony", 28, "钢厂");

        // 向上转型
        Person p = (Person) p4;

        // 向下转型
        Student p11 = (Student) p1;
        Worker p12 = (Worker) p2;

        /*
        Student p111= (Student)p2;
        Worker p121=(Worker)p1;
        Student p131=(Student)p3;
         */
    }
}
