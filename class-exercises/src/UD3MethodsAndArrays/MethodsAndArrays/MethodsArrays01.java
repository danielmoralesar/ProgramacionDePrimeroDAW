package UD3MethodsAndArrays.MethodsAndArrays;

public class MethodsArrays01 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 0};
        printMax(searchMax(numbers));
    }

    public static int searchMax(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static void printMax(int number) {
        System.out.println("El máximo es: " + number);
    }
}
