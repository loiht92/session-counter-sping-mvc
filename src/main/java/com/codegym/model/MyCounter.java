package com.codegym.model;

public class MyCounter { //Dem so luot view
    private int count;

    public MyCounter(){

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public MyCounter(int count){
        this.count = count;
    }

    public int increment(){ // Khi co luot truy cap thi so luong truy cap tang len 1.
        return count ++;
    }
}
