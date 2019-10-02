package com.aboyce002.learnerLab;

public class TestPerson {
    public static void main(String[] args) {
        Person dude = testConstructor();
        System.out.println(dude.toString());
        testSetName(dude);
        System.out.println(dude.toString());
    }

    public static Person testConstructor(){
        return new Person(1, "Bob");
    }

    public static void testSetName(Person p){
       p.setName("Carl");
    }
}
