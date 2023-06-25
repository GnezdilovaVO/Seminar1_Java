import java.util.Scanner;

public class program1_3 {
    static int getSumma(int firstNumb, int secondNumb) {
        int res = firstNumb + secondNumb;
        return res;
    }

    static int getDiff(int firstNumb, int secondNumb) {
        int res = firstNumb - secondNumb;
        return res;
    }

    static int getMulti(int firstNumb, int secondNumb) {
        int res = firstNumb * secondNumb;
        return res;
    }

    static double getDivis(double firstNumb, double secondNumb) {
        double res = firstNumb / secondNumb;
        return res;
    }

    public static void main(String[] args) {
        int data = 0;
        double data1 =0;

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите операцию: ");
        String result = iScanner.nextLine();
        System.out.print("Введите число a: ");
        int numberA = iScanner.nextInt();
        System.out.print("Введите число b: ");
        int numberB = iScanner.nextInt();
        iScanner.close();
        if (result.equals("+")) {
            data = getSumma(numberA, numberB);
            System.out.println(data);
        } else if (result.equals("-")) {
            data = getDiff(numberA, numberB);
            System.out.println(data);
        } else if (result.equals("*")) {
            data = getMulti(numberA, numberB);
            System.out.println(data);
        } else {
            double newNumbA = numberA;
            double newNumbB = numberB;
            data1 = getDivis(newNumbA, newNumbB);
            System.out.println(data1);
        }
    }
}
