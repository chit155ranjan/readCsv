package com.example.demo;

import com.opencsv.bean.CsvBindByName;

public class Attrin2 {


    public  String p;


    public String c;

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Attrin2{" +
                "p='" + p + '\'' +
                ", c='" + c + '\'' +
                '}';
    }
}
