package com.prog;
import java.util.Scanner;

public class Massiv {
    public static void main(String[] args) {
        int a[];
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число элементов массива ");
        n = in.nextInt();
        a = new int [n];
        for (int i = 0; i<n; i++){
            System.out.print("Введите a{"+ i +"]= ");
            a[i]=in.nextInt();
        }
    }
}
