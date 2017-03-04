package com.sdajava.if_statement1;

import java.util.Scanner;

public class Main {

            public static void main(String[] args) {
                char znak = '-';
                int a, b, wynik =0;

                System.out.println("Zmienna: " + (int) znak);

                Scanner wejście = new Scanner(System.in);

                System.out.println("Podaj liczbe");

                a = wejście.nextInt();

                System.out.println("Podaj znak: ");

                znak = wejście.next().charAt(0);

                System.out.println("Podaj drugą liczbe");

        b = wejście.nextInt();

        switch(znak) {
            case '+':
                System.out.println("Wykonuje operacje dodawania ");
                wynik = a + b;
                break;
            case '-':
                System.out.println("Wykonuje operacje odejmowania");
                wynik = a - b;
                break;
            case '*':
                System.out.println("Wykonuję operację mnożenie");
                wynik = a * b;
                break;
            case '/':
                System.out.println("Wykonuje operację dzielenia");
                if (b == 0) {
                    System.out.println("Nie można dzielić przez zero!");
                }else{
                    wynik = a/b;
                }
        }
        if(!(b == 0 && znak == '/')){
            System.out.println("wynik: " + wynik);
        }

    }
}
