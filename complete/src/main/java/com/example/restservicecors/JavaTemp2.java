package com.example.restservicecors;

//TODO: See implementations of interface
public class JavaTemp2 implements IJavaTemp{
    //TODO: Replace "hello" from s1 and s2 (not s3) with "world"
    public String Temp() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1 + s1 + "hello";
        return s2;
    }

    public float Calc(int i, int i2) {

        //TODO: Surround with try catch
        //TODO: Cast to float
        return i/i2;
    }
}
