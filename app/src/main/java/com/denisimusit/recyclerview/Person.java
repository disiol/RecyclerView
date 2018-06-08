package com.denisimusit.recyclerview;

import java.util.ArrayList;

class Person {
    String name;
    String age;
    int photoId;
    private ArrayList<Object> persons;

    Person(String name, String age, int photoId) {
        this.name = name;
        this.age = age;
        this.photoId = photoId;
    }



    public ArrayList<Object> getPersons() {
        return persons;
    }

    private void initializeData() {
        this.persons = new ArrayList<>();
        persons.add(new Person("Emma Wilson", "23 years old", R.drawable.emma));
        persons.add(new Person("Lavery Maiss", "25 years old", R.drawable.lavery));
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.lillie));
    }

}