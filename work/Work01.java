package com.work;

public class Work01 {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0]=new Person("jack",12,"C++");
        people[1]=new Person("kitty",16,"java");
        people[2]=new Person("jan",6,"python");
        people[3]=new Person("black",30,"go");
        people[0].say();
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].toString());
        }
        for (int i = 0; i < people.length-1; i++) {
            Person temp=null;
            for (int j = 0; j < people.length-1-i; j++) {
                if (people[j].getAge()>people[j+1].getAge()){
                    temp=people[j];
                    people[j]=people[j+1];
                    people[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}
class Person extends hjs.DateTest {
    private String name;
    private int age;
    private String jop;

    public Person(String name, int age, String jop) {
        this.name = name;
        this.age = age;
        this.jop = jop;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJop() {
        return jop;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJop(String jop) {
        this.jop = jop;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", jop='" + jop + '\'' +
                '}';
    }
}