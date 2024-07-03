import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    public int readFromConsole() {
        int operation;
        try {
            Scanner sc = new Scanner(System.in);
            operation = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("вы ввели не цифру");
            operation = readFromConsole();
        }
        return operation;
    }

    public int SelectOperation() {
        System.out.println("***************************");
        System.out.println("выберите операцию для выполнения \n1-  сложение\n2-  вычитание\n3-  умножение\n4-  деление\n5-  сравнение");
        System.out.println("***************************");
        int operation = 1000;
        do {
            System.out.println("ввелите число от1 до 5");
            try {
                operation = readFromConsole();
            } catch (InputMismatchException e) {
                System.out.println("вы ввели не цифру");
            }
        }
        while (operation < 0 || operation > 5);
        return operation;
    }

    public static String readString() {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите строку");
        return scan.nextLine();
    }

}
