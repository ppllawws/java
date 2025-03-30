package test;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую строку (не менее 50 символов): ");
        String a = sc.nextLine();
        System.out.println("Введите вторую строку (не менее 50 символов): ");
        String b = sc.nextLine();

        //проверка длины строк
        try {
            if (a.length() < 50) {
                throw new Exception("Первая строка должна содержать не менее 50 символов!");
            } //свое исключение
            if (b.length() < 50) {
                throw new Exception("Вторая строка должна содержать не менее 50 символов!");
            }
            if (a.length() < 50 && b.length() < 50) {
                throw new Exception("Каждая строка должна содержать не менее 50 символов!");
            }

            System.out.println("Строки введены корректно.");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println(a);
        System.out.println(b);
        int len_a = a.length();
        int len_b = b.length();
        System.out.println("Длина первой строки: " + len_a);
        System.out.println("Длина второй строки: " + len_b);
        System.out.println("Две строки вместе: " + (a + b));

        if (a.equals(b)) {
            System.out.println("Строки одинаковы.");
        } else {
            System.out.println("Строки разные.");


        }
    }
}
