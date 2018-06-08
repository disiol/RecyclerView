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


}