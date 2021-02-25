package com.narine;

public class Dumblеdore {

    private String name;
    private int age;
    private String wizard;

    public Dumblеdore () {
    }

    public Dumblеdore (String name, int age, String wizard){
        this.name = name;
        this.age = age;
        this.wizard = wizard;
    }

    public String getInfo () {
        return "Name: " + name + "\nAge: " + age + "\nWizard: " + wizard;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getWizard() {
        return wizard;
    }
}
