package com.one.model.dto;

public class PersonDTO {
    private String name;
    private int age;
    private double height;

    public PersonDTO(){}

    public PersonDTO(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "입장한 사람{" +
                "이름='" + name + '\'' +
                ", 나이=" + age +
                ", 키=" + height +
                '}';
    }
}
