package com.technews.testModel;

// practice creating constructor functions.

import java.util.Objects;

public class Demo {
    private String name;
    private int age;

    // constructor function - has same name as the class it's derived from, and it has no return type (not type before Demo). Remember, a constructor function creates objects based on a class blueprint.
    public Demo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Private variables can only be accessed from within the same class where they were created and initialized. However, we can circumvent that rule by using getters and setters. Getters and setters access private variables using public get() and set() methods. The get() method returns the variable value, while the set() method allows us to set the value
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

// adding the equals() and hashCode() methods to the Demo class. Spring Data JPA (sequelize) will use the equals() method to compare two objects. However, this method compares objects by hash code (or reference number), rather than by value. Thus, two distinct objects with the same value would be interpreted as NOT equal. We'll override that functionality so that equals() compares objects based on values, but we'll also need to override hashCode() when we do that because it is closely linked. right-click, elect Generate. click equals and hashcode, click next all the way through


    //When you see the @Override annotation on a method, it means that the method is coming to the class from a superclass (or parent class). In this case, that superclass is the Object class. Override Not required but best practice
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo demo = (Demo) o;
        return age == demo.age && Objects.equals(name, demo.name);
    }


    // supposed to be inside the haschode method?
    // By default, toString() returns the reference number of an object—but we want the actual value of an object, rather than just its reference number. We'll be able to view the value of an object within the log file.
    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
