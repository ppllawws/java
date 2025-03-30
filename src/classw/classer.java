import java.util.Scanner;

public class classer {
    private static final Scanner scanner;

    public void Task1Base() {
    }

    public static void main(String[] args) {
        System.out.print("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043f\u0435\u0440\u0432\u043e\u0435 \u0447\u0438\u0441\u043b\u043e: ");
        double num1 = scanner.nextDouble();
        System.out.print("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0432\u0442\u043e\u0440\u043e\u0435 \u0447\u0438\u0441\u043b\u043e: ");
        double num2 = scanner.nextDouble();
        executeMathOperation("\u0421\u043b\u043e\u0436\u0435\u043d\u0438\u0435", "+", num1, num2);
        executeMathOperation("\u0412\u044b\u0447\u0438\u0442\u0430\u043d\u0438\u0435", "-", num1, num2);
        executeMathOperation("\u0423\u043c\u043d\u043e\u0436\u0435\u043d\u0438\u0435", "*", num1, num2);
        executeMathOperation("\u0414\u0435\u043b\u0435\u043d\u0438\u0435", "/", num1, num2);
        executeMathOperation("\u0414\u0435\u043b\u0435\u043d\u0438\u0435 \u043f\u043e \u043c\u043e\u0434\u0443\u043b\u044e", "%", num1, num2);
        executeMathOperation("\u041c\u043e\u0434\u0443\u043b\u044c \u0447\u0438\u0441\u043b\u0430", "abs", num1, num2);
        executeMathOperation("\u0412\u043e\u0437\u0432\u0435\u0434\u0435\u043d\u0438\u0435 \u0432 \u0441\u0442\u0435\u043f\u0435\u043d\u044c", "pow", num1, num2);
    }

    private static void executeMathOperation(String operationName, String operation, double num1, double num2) {
        num2 = operation.equals("abs") ? 0.0 : num2;
        double var10000;
        switch (operation) {
            case "+":
                var10000 = num1 + num2;
                break;
            case "-":
                var10000 = num1 - num2;
                break;
            case "*":
                var10000 = num1 * num2;
                break;
            case "/":
                var10000 = num1 / num2;
                break;
            case "%":
                var10000 = num1 % num2;
                break;
            case "abs":
                var10000 = Math.abs(num1);
                break;
            case "pow":
                var10000 = Math.pow(num1, num2);
                break;
            default:
                var10000 = 0.0;
        }

        double result = var10000;
        System.out.printf("%s \u0434\u0432\u0443\u0445 \u0447\u0438\u0441\u0435\u043b: %s%n", operationName, result);
    }

    static {
        scanner = new Scanner(System.in);
    }
}

