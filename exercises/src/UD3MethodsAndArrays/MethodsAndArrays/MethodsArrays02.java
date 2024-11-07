package UD3MethodsAndArrays.MethodsAndArrays;

public class MethodsArrays02 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 0};
        printSum(sumArrays(numbers));
    }

    public static int sumArrays(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void printSum(int sum) {
        System.out.println("La suma es: " + sum);
    }
}
