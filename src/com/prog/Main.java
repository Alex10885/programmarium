package com.prog;

import java.lang.String;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first,secont,result;
        System.out.println("Введите первое число");
        first = num.nextInt();
        System.out.println("Введите второе число");
        secont = num.nextInt();
        result = first + secont;
        if(result <= 10) {
            System.out.println("Сумма двух чисел удовлетворяет условию и равна: " + result);
        } else {
            System.out.println("Диапазон не удовлетворяет условию");
        }

        switch (result) {
            case 0:
                System.out.println("Запускаю систему обратного отсчета");
                for(int i = 10; i>0; i--) {
                    System.out.println(i);
                }
                System.out.println("Пуск");
                break;
            case 1:
                System.out.println("Сумма двух чисел неудовлетворяет условию и равен 1-му ");
                break;
            case 2:
                System.out.println("Малое значение параметра он равен 2-м ");
                break;

        }
    }
}