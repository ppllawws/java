import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int type;
        while (true) {
            System.out.println("Выберите тип данных: 1 - int, 2 - byte, 3 - double");
            if (scanner.hasNextInt()) {
                type = scanner.nextInt();
                if (type >= 1 && type <= 3) break;
            } else {
                System.out.println("Ошибка: Введите число от 1 до 3.");
            }
            scanner.nextLine(); //очистка буфера
        }

        double num1 = 0, num2 = 0;
        try {
            System.out.print("Введите первое число: ");
            num1 = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            num2 = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Ошибка: введено не число.");
            scanner.nextLine(); //очистка буфера после некорректного ввода
            return; //прерываю выполнение программы
        }

        //ввод операции с обработкой ошибок
        int operation = 0;
        try {
            System.out.println("Выберите операцию: 1 - Сложение, 2 - Вычитание, 3 - Умножение, 4 - Деление, 5 - Остаток, 6 - Модуль, 7 - Степень");
            operation = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Ошибка: введена неверная операция.");
            scanner.nextLine(); //очистка буфера после некорректного ввода
            return;
        }

        double result = switch (operation) {
            case 1 -> num1 + num2;
            case 2 -> num1 - num2;
            case 3 -> num1 * num2;
            case 4 -> num2 != 0 ? num1 / num2 : Double.NaN; //тернарный оператор
            case 5 -> num2 != 0 ? num1 % num2 : Double.NaN;
            case 6 -> Math.abs(num1);
            case 7 -> Math.pow(num1, num2);
            default -> Double.NaN;
        };

        if (Double.isNaN(result)) {
            System.out.println("Ошибка: неверная операция или деление на ноль.");
        } else {
            System.out.println("Результат: " + result);
        }

        scanner.close();
    }
}
