package com.work.work4;

public class Doctor {
    private String name;
    private int age;
    private String job;
    private String gental;
    private double sal;

    public Doctor(String name, int age, String job, String gental, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gental = gental;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGental() {
        return gental;
    }

    public void setGental(String gental) {
        this.gental = gental;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
