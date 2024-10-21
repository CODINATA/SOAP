package com.info.model;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Person")
public class Person {
    private int id;
    private String name;
    private int age;



    // Parameterized constructor
    public Person() {

    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Overriding toString() for easy printing of Person objects
    @Override
    public String toString() {
        return "Person [ID: " + id + ", Name: " + name + ", Age: " + age + "]";
    }
}
