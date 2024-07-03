public class Task1 {
    public static void main(String[] args) {
        int a;
        int b;
        Utils operation=new Utils();
        int x = operation.SelectOperation();
        System.out.println("your value- " + x);

        switch (x) {

            case 1:
                System.out.println("введите число а");
                a=operation.readFromConsole();
                System.out.println("ввелите число b");
                b=operation.readFromConsole();
                System.out.println(mathOperation.adding(a,b));

                break;
            case 2:
                System.out.println("введите число а");
                a=operation.readFromConsole();
                System.out.println("ввелите число b");
                b=operation.readFromConsole();
                System.out.println(mathOperation.subtraction(a,b));
                break;
            case 3:
                System.out.println("введите число а");
                a=operation.readFromConsole();
                System.out.println("ввелите число b");
                b=operation.readFromConsole();
                System.out.println(mathOperation.multiply(a,b));

                break;
            case 4:
                System.out.println("введите число а");
                a=operation.readFromConsole();
                System.out.println("ввелите число b");
                b=operation.readFromConsole();
                System.out.println(mathOperation.divide(a,b));

                break;
            case 5:
                System.out.println("введите число а");
                a=operation.readFromConsole();
                System.out.println("ввелите число b");
                b=operation.readFromConsole();
                System.out.println(mathOperation.compareValues(a,b));
        }
    }
}
