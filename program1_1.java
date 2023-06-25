import java.util.Scanner;
public class program1_1 {
    static int sumNumb(int numb) {
        if (numb == 0) return 0;
        return numb + sumNumb(numb-1);
    }
    static int factorial(int numb) {
        if (numb == 1 || numb == 0) return 1;
        return numb * factorial(numb-1);
    }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int number = iScanner.nextInt();
        iScanner.close();
        // int summa = 0;
        // for (int i = 1; i <= number; i++) {
        //     summa = summa + i;
        // }
        // System.out.println(summa);
        int summa = sumNumb(number);
        int multi = factorial(number);
        System.out.println("Сумма " + number + ":" +  summa + " " + "Факториал " + number + ":" + multi);
    }
}
