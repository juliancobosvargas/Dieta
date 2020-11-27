package com.example.dietajuliancobos;

public class MiGlobal {

    private static int contador1 = 1;
    private static int contador2= 1;

    public static int getContador1() {
        if (contador1 >= 13){
            contador1 = 1;
        }else {
            contador1 += 1;
        }
        return contador1;
    }

    public static int getContador2() {
        if (contador2 >= 13){
            contador2 = 1;
        }else {
            contador2 += 1;
        }
        return contador2;
    }
}
