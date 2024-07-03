public class mathOperation {
    public static String compareValues(int a, int b) {
        if ((a - b) < 0)
            return (" a < b ");
        else if (a - b == 0)
            return (" a = b ");
        else if ((a - b) > 0)
            return (" a > b ");
        else
            return (" вы наверное ввели некоректные данные");

    }

    public static String adding(int a, int b) {
        return "сумма  a  и b  равна  " + (a + b);
    }

    public static String subtraction(int a, int b) {
        return " разница   a  и b  равна  " + (a - b);
    }

    public static String multiply(int a, int b) {
        return " умножение   a  и b  равно  " + (a - b);
    }

    public static String divide(int a, int b) {
        if (b == 0) {
            return "деление на 0 невозможно";
        } else
            return " умножение   a  и b  равно  " + (a - b);
    }
}
