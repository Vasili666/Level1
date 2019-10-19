
//2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.

public class ReverseOrder {
    public static void main(String[] args) {
        for (int i = args.length-1; i>-1; i--){
            System.out.println("arg" + i + args[i]);
        }

    }
}
