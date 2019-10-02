package com.aboyce002.learnerLab;

public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student(1, "Sarah", 10);
        System.out.println("Student is an instanceof learner: " + testImplementation(stu));
        System.out.println("Student is an instanceof person: " + testInheritance(stu));
        System.out.println("TestLearn +23: " + testLearn(stu));
    }

    public static boolean testImplementation(Student s){
        return s instanceof Learner;
    }

    public static boolean testInheritance(Student s){
        return s instanceof Person;
    }

    public static double testLearn(Student s){
        s.learn(23);
        return s.getTotalStudyTime();
    }
}
