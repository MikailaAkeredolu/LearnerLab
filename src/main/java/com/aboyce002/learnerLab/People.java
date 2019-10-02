package com.aboyce002.learnerLab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People<E> implements Iterable<E> {
    List<Person> personList = new ArrayList<Person>();

    public void add(Person p){
        personList.add(p);
    }

    public Person findById(long id){
        for(Person p : personList) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }

    public boolean contains(Person p){
        return personList.contains(p);
    }

    public void remove(Person p){
        personList.remove(p);
    }

    public void remove(long id){
        for(Person p : personList) {
            if (p.getId() == id)
                personList.remove(p);
        }
    }

    public void removeall(){
        personList.clear();
    }

    public void count(){
        personList.size();
    }

    public void toArray(){
        personList.toArray();
    }

    @Override
    public Iterator<E> iterator(){

        return new Iterator<E>() {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < personList.size() && personList.get(currentIndex) != null;
        }

        @Override
        public E next() {
            return (E) personList.get(currentIndex++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
        };
    }
}
