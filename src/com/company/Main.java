package com.company;

public class Main {

    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println("Площадь квадрата =" + area(s));

        Rectangle r = new Rectangle(1,5);
        System.out.println("Площадь прямоугольника =" + area(r));

    }
    public static double area(Square s){
        return s.l * s.l;
    }
    public static double area(Rectangle r){
        return r.a * r.b;
    }
}
