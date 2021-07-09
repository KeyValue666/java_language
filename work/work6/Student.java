package com.work.work6;

public class Student extends Person {
    private String stu_id;

    public Student(String name, int age, char sex, String stu_id) {
        super(name, age, sex);
        this.stu_id = stu_id;
    }


    public String play() {
       return getName()+"喜欢玩足球";
    }

    public String study(){
        return "我承诺，我要好好学习。";
    }

    @Override
    public String toString() {
        return "学生的信息为：\n"+
                "学生姓名："+getName()+'\n'+
                "性别："+getSex()+'\n'+
                "年龄："+getAge()+'\n'+
                "学号："+getStu_id()+'\n'+
                this.study()+'\n'+
                this.play();
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
}
