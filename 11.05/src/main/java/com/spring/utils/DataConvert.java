package com.spring.utils;

import org.springframework.core.convert.converter.Converter;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataConvert implements Converter<String, Data> {
    @Override
    public Data convert(String s) {
        System.out.println(s);
        System.out.println("转换器");
//将日期字符串转换成日期对象 返回
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = null;
        try {
            parse = format.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return (Data) parse;
    }
}
