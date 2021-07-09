package com.work.work5;

public class TestDemo {
    public static void main(String[] args) {
        Person student = new Student();
        student.eat();
        student.run();
        /*
        //引用不到study
        person eat
        Studet run
        */
        Student student1=(Student)student;
        student1.study();
        student1.run();
        student1.eat();
        /*
        student study
        Studet run
        person eat
        * */
    }
}
