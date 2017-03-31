package com.example.sreevidyak.dropmetestapp.model;

/**
 * Created by Sreevidya K on 3/30/2017.
 */

public class PassengerInfo {
    private String mName;
    private int mAge;

    public PassengerInfo(String name, int age){
        putName(name);
        putAge(age);
    }

    public String getName(){
        return mName;
    }

    public int getAge(){
        return mAge;
    }

    public void putName(String name){
        mName = name;
    }

    public void putAge(int age){
        mAge = age;
    }
}
