package com.example.animaldetails;

public class Animal {
    private int mImage;
    private String mName,mSound;

    public Animal(int mImage, String mName, String mSound) {
        this.mImage = mImage;
        this.mName = mName;
        this.mSound = mSound;
    }

    public int getmImage() {
        return mImage;
    }

    public String getmName() {
        return mName;
    }

    public String getmSound() {
        return mSound;
    }
}
