package com.copasso.billbook.bean;

import java.util.ArrayList;

public class First {
    private String name;
    private int image;
    private ArrayList<String> second = new ArrayList<>();
    private String inorout;//转账trans，收入in，支出out，通用all(如自定义)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public ArrayList<String> getSecond() {
        return second;
    }

    public void setSecond(ArrayList<String> second) {
        this.second = second;
    }

    public String getInorout() {
        return inorout;
    }

    public void setInorout(String inorout) {
        this.inorout = inorout;
    }
}
