package com.aboyce002.learnerLab;

public class Instructors extends People {
    private Instructors(){
        getInstance().add(new Instructor(0, "Mikaila"));
        getInstance().add(new Instructor(1, "Jackson"));
        getInstance().add(new Instructor(2, "Peter"));
        getInstance().add(new Instructor(3, "Tori"));
    }

    private static class SingletonHelper{
        private static final Instructors INSTANCE = new Instructors();
    }

    public static Instructors getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
