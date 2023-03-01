import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            double num1;
            double result = 0;
            char operator;
            Scanner scanner = new Scanner(System.in);
            System.out.println("введите первое число");
            num1 = scan.nextDouble();
            System.out.println("Введите операцию: + - * /");
            operator = scan.next().charAt(0);
            try {
                System.out.println("Введите второе число");
                double num2 = scan.nextDouble();
                switch (operator) {
                    case '-':
                        result = num1 - num2;
                        System.out.println(result);
                        break;
                    case '+':
                        result = num1 + num2;
                        System.out.println(result);
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.println(result);
                        break;
                    case '/':
                        result = num1 / num2;
                        System.out.println(result);
                        break;
                    default:
                        System.out.println("Неверный оператор! Введите: - либо + либо * либо /");
                }
                if ((result == Double.POSITIVE_INFINITY) || (result == Double.NEGATIVE_INFINITY)) {
                    System.out.println("Нельзя делить на 0");
                }
            } catch (ArithmeticException e) {
                System.out.println("Нельзя делить на 0");
            }
            System.out.println("Желаете продолжить? да/нет");
            String answer = scanner.nextLine();
            if (answer.equals("да")) {
                System.out.println("Продолжаем!");
            } else if (answer.equals("нет")) {
                break;


            }

        }

    }
}





