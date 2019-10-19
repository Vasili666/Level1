

//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

public class PrintlnAndPrint {
    public static void main(String[] args) {


        for (int i=0; i<args.length;i++){
            int num = Integer.parseInt(args[i]);
            System.out.println(num);
        }
        for (int i=0; i<args.length;i++){
            int num = Integer.parseInt(args[i]);
            System.out.print(num);
        }
    }

}
