package cn.sensor.test;


import java.util.Date;

public class test {
    public static void main(String[] args){
        Date nowTime=new Date();
        String t1=String.format("%tY-%<tm-%<td-%<tH:%<tM:%<tS",nowTime);
        System.out.println(t1);
    }
}
