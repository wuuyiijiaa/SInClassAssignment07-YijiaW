package com.example.sinclassassignment07_yijiaw;

import java.io.Serializable;

public class Person implements Serializable {
    public String name;
    public int age;
    public String gender;
    public boolean glasses;
    public String info;


    public Person(String name, int age, String gender, boolean glasses, String info) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.glasses = glasses;
        this.info = info;

    }

    public boolean isGlasses() {
        return glasses;
    }

    public void setGlasses(boolean glasses) {
        this.glasses = glasses;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getInfo() {
        return info;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String toString() {
        return "Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "Gender: " + gender + "\n"
                + "Glasses: " + glasses + "\n"
                + "Info: " + info;
    }
}

