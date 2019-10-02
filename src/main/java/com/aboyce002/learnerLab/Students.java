package com.aboyce002.learnerLab;

public class Students extends People {
    private Students(){
        getInstance().add(new Student(0, "Aubrey", 0));
        getInstance().add(new Student(1, "Sarah", 0));
        getInstance().add(new Student(2, "Carlos", 0));
        getInstance().add(new Student(3, "Serafin", 0));
    }

    private static class SingletonHelper{
        private static final Students INSTANCE = new Students();
    }

    public static Students getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
