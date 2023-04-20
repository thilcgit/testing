package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("results are ");
        System.out.println(hasSameLastDigit(41,22,70));
    }

    public static boolean hasSameLastDigit(int para1, int para2, int para3) {
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        if (para1 < 10 || para1 > 1000 || para2 < 10 || para2 > 1000 || para3 < 10 || para3 > 1000) {
            return false;
        }
        if (para1 % 10 == para2 % 10 || para2 % 10 == para3 % 10 || para1 % 10 == para3 % 10) {
            return true;
        }
        return false;
    }
    public static boolean isValid(int para4){
        if(para4>=10 && para4<=1000){
            return true;
        }
        return false;
    }
}
