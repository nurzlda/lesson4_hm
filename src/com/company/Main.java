package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите мужских имен: " + "\n 1: ");
        String man1 = scanner.next();
        System.out.println("2: ");
        String man2 = scanner.next();
        System.out.println("3: ");
        String man3 = scanner.next();
        System.out.println("4: ");
        String man4 = scanner.next();
        System.out.println("5: ");
        String man5 = scanner.next();

        ArrayList<String> men = new ArrayList<>();
        men.add(man1);
        men.add(man2);
        men.add(man3);
        men.add(man4);
        men.add(man5);
        System.out.println(men);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Напишите женских имен: " + "\n 1: ");
        String woman1 = scanner2.next();
        System.out.println("2: ");
        String woman2 = scanner2.next();
        System.out.println("3: ");
        String woman3 = scanner2.next();
        System.out.println("4: ");
        String woman4 = scanner2.next();
        System.out.println("5: ");
        String woman5 = scanner2.next();

        ArrayList<String> women = new ArrayList<>();
        women.add(woman1);
        women.add(woman2);
        women.add(woman3);
        women.add(woman4);
        women.add(woman5);
        Collections.reverse(women);
        men.addAll(women);
        
        ArrayList<String> people = new ArrayList<>();
        int countMen = 0;
        int countWomen = 0;
        for (int i = 0; i < (men.size()); i++) {
            if ((i % 2) == 0) {
                people.add(men.get(countMen));
                countMen++;
            } else {
                people.add(women.get(countWomen));
                countWomen++;
            }
        }

        System.out.println("Список: " + people);
        people.sort(Comparator.comparing(String::length));
        System.out.println("Сортированный список: " + people);
    }




    }

