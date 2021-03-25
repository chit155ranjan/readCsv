package com.example.demo;

import com.opencsv.bean.CsvBindAndJoinByName;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvRecurse;

public class Attrib {

    @CsvRecurse
    public Attrib1 attrib1;

    @CsvRecurse
    public Attrib3 attrib3;

    @CsvBindByName
    public String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Attrib{" +
                "attrib1=" + attrib1 +
                ", attrib3=" + attrib3 +
                ", str='" + str + '\'' +
                '}';
    }
}
