package com.basicjavaprogram;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base in meter");
        double Base=sc.nextDouble();
        System.out.println("enter the perpendicular height in meter");
        double Height=sc.nextDouble();
        double AreaOfIsoscelesTriangle=Base*Height;
        System.out.println(AreaOfIsoscelesTriangle);
    }
}
