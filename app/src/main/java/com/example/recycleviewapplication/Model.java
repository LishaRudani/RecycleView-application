package com.example.recycleviewapplication;
public class Model {
    int img1;
    String title;

    public Model() {
    }

    public Model(int img1, String title) {
        this.img1 = img1;
        this.title = title;
    }

    public int getImg1() {
        return img1;
    }

    public void setImg1(int img1) {
        this.img1 = img1;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

