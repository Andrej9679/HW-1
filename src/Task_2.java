import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        String userPassword = "Пароль";
        String stopWord = "Выход";

        while (true) {
            System.out.println("Введите пароль");
            Scanner scanner = new Scanner(System.in);
            String password = scanner.nextLine();

            boolean passwordCheck = password.equals(userPassword);

            if ((!password.equals(stopWord)) && !passwordCheck) {
                System.out.println("Неверный пароль, введите пароль заново!");

            } else if (password.equals(stopWord)) {
                System.out.println("Вы передумали регистрироваться: (");
                break;
            } else {
                System.out.println("Вы вошли в систему :)");
                break;
            }
        }
    }
}
