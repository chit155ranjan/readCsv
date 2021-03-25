package com.example.demo;

import com.opencsv.bean.CsvBindByName;

public class Attrib3 {

    @CsvBindByName
    public  String r;

    @CsvBindByName
    public String c;

    public String getR() {
        return r;
    }

    public void setR(String r) {
        this.r = r;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Attrib3{" +
                "r='" + r + '\'' +
                ", c='" + c + '\'' +
                '}';
    }
}
