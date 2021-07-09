package com.work.work6;

public class TestDemo {
    public static void main(String[] args) {
        Student student = new Student("小明", 12, '男', "123456");
        System.out.println(student.toString());
        System.out.println("----------------------------------");
        Teacher teacher = new Teacher("老韩", 40, '男', 10);
        System.out.println(teacher.toString());
        Person[] people = new Person[4];
        people[0] = new Student("张三", 12, '男', "0102012");
        people[1] = new Student("爱丽丝", 49, '女', "0102012");
        people[2] = new Teacher("老牛", 10, '男', 10);
        people[3] = new Teacher("小丽", 40, '女', 10);
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].toString());
            System.out.println("===============");
        }
        /*BubleSort(people);
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].toString());
            System.out.println("===============");
        }*/
    }

    public static void BubleSort(Person[] person) {
        Person person1 = null;
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - i - 1; j++) {
                if (person[j].getAge() > person[j + 1].getAge()) {
                    person1 = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = person1;
                }
            }
        }
    }
}
