public class Task2 {
    public static void main(String[] args) {
        System.out.println("введите сравниваемые строки, для выхода нажмите 0");
        System.out.println("***************");
        String a = Utils.readString();
        System.out.println("a=" + a);
        String b = Utils.readString();
        System.out.println("b=" + b);
        if (a.equals(b))
            System.out.println("строки идентичны");
        else System.out.println("строки неидентичны");
    }
}
