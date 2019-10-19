
// Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

public class NumbersSumMulti {

    public static void main(String[] args) {
        int sum=0;
        int mult=1;
        for (int i=0; i<args.length;i++){
            int num = Integer.parseInt(args[i]);
            if (num%1==0) {
                sum+=num;
                mult*=num;
            }else {
                System.out.println("Number not Integer");
            }

        }
        System.out.println("Sum: "+ sum);
        System.out.println("Multiplication: " + mult);
    }
}
