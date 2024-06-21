
public class Averaging {

    // implement the sum method here again
    public static int sum(int num1, int num2, int num3, int num4) {
        // write some code here
        int result = num1 + num2 + num3 + num4;
        return result;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        //write some code here
        int sum = sum(number1, number2, number3, number4);
        double av = (double) sum / 4;
        return av;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
