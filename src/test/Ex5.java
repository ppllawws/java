package test;

import java.io.IOException;

public class Ex5 {
    // Метод читает файл, но не обрабатывает ошибку сам
    public static void readFile(String fileName) throws IOException {
        if (fileName == null) {
            throw new IOException("Файл не найден!");
        }
        System.out.println("Файл успешно прочитан!");
    }

    public static void main(String[] args) {
        try {
            readFile(null); // Ошибка
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
