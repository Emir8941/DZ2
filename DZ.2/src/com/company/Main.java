package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(world(generateRandomAge(), generateRandomTemp()));
        System.out.println(world(generateRandomAge(), generateRandomTemp()));
        System.out.println(world(generateRandomAge(), generateRandomTemp()));
        System.out.println(world(generateRandomAge(), generateRandomTemp()));
        System.out.println(world(generateRandomAge(), generateRandomTemp()));


    }


    public static String world(int age, int temp) {
        if (age > 20 && age < 45 && temp > -20 && temp < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temp > 0 && temp < 28) {
            return "Можно идти гулять2";
        } else if (age > 45 && temp > -10 && temp < 25) {
            return "Можно идти гулят3";
        } else {
            return "Оставайтесь дома";
        }

    }

    public static int generateRandomAge() {
        Random random = new Random();
        int age = random.nextInt(100);
        return age;


    }

    public static int generateRandomTemp() {
        Random random = new Random();
        int temp = random.nextInt(100);
        return temp;
    }
}