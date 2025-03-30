package test;
import java.util.Scanner;

public class Ex4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = "", str2 = "";

        while (str1.length() < 50) {
            System.out.print("Введите первую строку (не менее 50 символов): ");
            str1 = scanner.nextLine();
        }
        while (str2.length() < 50) {
            System.out.print("Введите вторую строку (не менее 50 символов): ");
            str2 = scanner.nextLine();
        }

        System.out.println("Первая строка: " + str1);
        System.out.println("Вторая строка: " + str2);

        //подстрока с индексами
        System.out.print("Введите начальный индекс для подстроки (от 0 до " + (str1.length() - 1) + "): ");
        int startIndex = scanner.nextInt();
        System.out.print("Введите конечный индекс для подстроки (от " + (startIndex + 1) + " до " + (str1.length()) + "): ");
        int endIndex = scanner.nextInt();

        //корректность индексов
        if (startIndex >= 0 && endIndex <= str1.length() && startIndex < endIndex) {
            String substring = str1.substring(startIndex, endIndex);
            System.out.println("Подстрока из первой строки: " + substring);
        } else {
            System.out.println("Некорректные индексы для подстроки.");
        }

        //верхний и нижний регистры
        System.out.println("Первая строка в верхнем регистре: " + str1.toUpperCase());
        System.out.println("Первая строка в нижнем регистре: " + str1.toLowerCase());

        System.out.println("Вторая строка в верхнем регистре: " + str2.toUpperCase());
        System.out.println("Вторая строка в нижнем регистре: " + str2.toLowerCase());
    }
}