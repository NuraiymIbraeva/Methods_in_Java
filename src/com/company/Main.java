package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        sum(a, b);
        sum(3, b);
        sum(5, 22);
        display(25, "Бахтияр");
        display(25, "Бахтияр");

        sum(1, 2, 3, 4);
        sum(1, 2, 3, 4);
        sum();

        System.out.println(dayTime(7));//Good morning
        System.out.println(dayTime(13));//Good afternoon
        System.out.println(dayTime(18));//Good evening
        System.out.println(dayTime(25));//Good night

        System.out.println(number(55,65));
        System.out.println( number(852.4,515));
        System.out.println(number(55,65,25));



    }


    static void sum(int x, int y) {

        int z = x + y;
        System.out.println(z);

    }


    static void display(int age, String name) {

        System.out.println(age + "" + "" + " " + name);//System.out.println(name);


    }

    static void sum(int... nums) {
        int result = 0;
        for (int n : nums)
            result += n;
        System.out.println(result);
    }

    static String dayTime(int hour) {

        if (hour > 24 || hour < 0 )
            return "Invalid data";
        else if (hour > 21 || hour < 6)
            return "Good night";
        else if (hour >= 15)
            return "Good night";
        else if (hour >= 11)
            return "good afternoon";
        else
            return "Good morning";
    }
    // method overloading
    //перегруженнный метод с разнымыи типами и количеством параметров
    static int number(int x,int y){
        return x+y;
    }static double number(double x,int y){
        return x+y;
    }static int number(int x,int y,int h){
        return x+y+h;
    }
//Здесь определено три варианта или три перегрузки метода sum(),
// но при его вызове в зависимости от типа и количества передаваемых
// параметров
// система выберет именно ту версию, которая наиболее подходит.




}



