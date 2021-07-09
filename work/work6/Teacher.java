package com.work.work6;

public class Teacher extends Person {
    private int work_age;

    public Teacher(String name,int age,char sex,int work_age) {
        super(name, age, sex);
        this.work_age = work_age;
    }

    public String play() {
        return getName()+"喜欢下棋";
    }

    public String teach(){
        return "我承诺 ，我会好好教学。";
    }

    @Override
    public String toString() {
        return "教师的信息为：\n"+
                "教师姓名："+getName()+'\n'+
                "性别："+getSex()+'\n'+
                "年龄："+getAge()+'\n'+
                "工龄："+getWork_age()+'\n'+
                this.teach()+'\n'+
                this.play();
    }


    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
}
