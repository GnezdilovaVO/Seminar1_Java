public class program1_4 {
    public static void main(String[] args) {
        // String result = "2? + ?5 = 69";
        int result = 77;
        int numberA = 3;
        int numberB = 2;
        numberA = numberA*10;
        int temp1 = (result - numberA)/10;
        System.out.println(temp1);
        int temp2 = result%10 - numberB;
        numberA = numberA + temp2;
        numberB = temp1*10 + numberB;
        System.out.println(numberA + " + " + numberB + " = " + result);
        // for (String item : temp) {
        //     System.out.println(item);
        // }
    }
}
