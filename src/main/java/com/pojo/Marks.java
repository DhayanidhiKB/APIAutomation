package com.pojo;


//without lombok
public class Marks {

    private int tamil;
    private int english;

    public int getTamil() {
        return tamil;
    }

    public Marks(int tamil, int english) {
        this.tamil = tamil;
        this.english = english;
    }

    public void setTamil(int tamil) {
        this.tamil = tamil;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

}
