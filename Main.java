package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String stop = "yes";
            int sr = 0;
            while (stop!="stop") {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                String operation = scanner.next();
                switch (operation) {
                    case "-":
                        System.out.println(a - b);
                        break;
                    case "+":
                        System.out.println(b + a);
                        break;
                    case "*":
                        System.out.println(b * a);
                        break;
                    case "/":
                        System.out.println(a / b);
                        break;

                }

                System.out.println("Продолжить?");
                stop = scanner.next();
                }
        }
    }

