package com.work;

public class Work03 {
    public static void main(String[] args) {
        Teacher teacher = new Profession();
        teacher.salary = 10;
        teacher.introduce();
    }
}

class Teacher {
    int age;
    double salary;
    String name;
    String post;

    public void introduce() {
        System.out.println("老师的薪资方法");
    }
}

class Profession extends Teacher {
    @Override
    public void introduce() {
        System.out.println("教授的薪资为" + salary);
    }
}

class NextProfession extends Teacher {
    @Override
    public void introduce() {
        System.out.println("副教授的薪资为" + salary);
    }
}

class Desk extends Teacher {
    @Override
    public void introduce() {
        System.out.println("讲师的薪资为" + salary);
    }
}