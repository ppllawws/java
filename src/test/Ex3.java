package test;

import java.util.*;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            String input = sc.nextLine();  //тк может быть нецелое

            try {
                int num = Integer.parseInt(input);  //преобразовываю строку в целое число

                //проверка на четность
                if (num % 2 == 0) {
                    System.out.println("Число " + num + " четное.");
                } else {
                    System.out.println("Число " + num + " нечетное.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введено не целое число.");
            }
        }
    }
}