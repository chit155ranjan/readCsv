package com.example.demo;

import com.opencsv.bean.CsvBindAndSplitByName;
import com.opencsv.bean.CsvBindByName;

import java.util.List;

public class Attrib1 {

    @CsvBindByName
    public  String x;

    @CsvBindByName
    public String y;

    @CsvBindAndSplitByName(elementType= Attrin2.class, splitOn = "\\|", converter = TextToAttrin2.class)
    public List<Attrin2> attrin2List;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public List<Attrin2> getAttrin2List() {
        return attrin2List;
    }

    public void setAttrin2List(List<Attrin2> attrin2List) {
        this.attrin2List = attrin2List;
    }

    @Override
    public String toString() {
        return "Attrib1{" +
                "x='" + x + '\'' +
                ", y='" + y + '\'' +
                ", attrin2List=" + attrin2List +
                '}';
    }
}
