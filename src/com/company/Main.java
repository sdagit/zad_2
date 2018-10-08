package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj 2 liczby a ja wyśweitlę ich sumę!");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("SUMA:" + (a+ b));
    }
}
