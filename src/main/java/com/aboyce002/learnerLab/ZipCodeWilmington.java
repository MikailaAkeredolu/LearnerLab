package com.aboyce002.learnerLab;

import java.util.HashMap;

public class ZipCodeWilmington {
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();

    private ZipCodeWilmington(){}

    private static class SingletonHelper{
        private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    }

    public static ZipCodeWilmington getInstance(){
        return SingletonHelper.INSTANCE;
    }

    public static void hostLecture(Teacher teacher, double numberOfHours){
        Student[] s = (Student[]) students.personList.toArray();
        teacher.lecture(s, numberOfHours);
    }

    public static void hostLecture(long id, double numberOfHours){
        Student[] s = (Student[]) students.personList.toArray();
        Instructor[] i = (Instructor[]) instructors.personList.toArray();
        for(Instructor in : i){
            if(id == in.getId())
                in.lecture(s, numberOfHours);
        }
    }

    public static HashMap<Student, Double> getStudyMap(){
        HashMap<Student, Double> study = new HashMap<>();
        for(int i = 0; i < students.personList.size(); i++)
        {
            study.put((Student)students.personList.get(i), ((Student) students.personList.get(i)).getTotalStudyTime());
        }
        return study;
    }
}
