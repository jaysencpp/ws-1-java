package com.example.restservicecors;

//TODO: Rename class and file to JavaTemp and update all usages
public class JavaTmp implements IJavaTemp {

    public String Temp(){

        //TODO: Introduce local variable
        return "hello" + "world";
    }
    
    public int Calc(boolean b1, boolean b2, int i1) {
        //TODO: Extract 'b1 && b2 || i1 > 10 to method
        if(b1 && b2 || i1 > 10) {
            return 1;
        } else return 2;
    }
}
