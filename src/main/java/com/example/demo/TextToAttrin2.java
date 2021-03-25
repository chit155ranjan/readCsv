package com.example.demo;

import com.opencsv.bean.AbstractCsvConverter;

public class TextToAttrin2 extends AbstractCsvConverter {

    @Override
    public Object convertToRead(String value) {
        Attrin2 t = new Attrin2();
        String[] split = value.split("\\.", 2);
        t.setP(split[0]);
        t.setC(split[1]);
        return t;
    }

    @Override
    public String convertToWrite(Object value) {
        Attrin2 t = (Attrin2) value;
        return String.format("%s,%s", t.getP(), t.getC());
    }
}
