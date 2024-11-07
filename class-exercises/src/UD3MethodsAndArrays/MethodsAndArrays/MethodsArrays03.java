package UD3MethodsAndArrays.MethodsAndArrays;

import java.util.Scanner;

public class MethodsArrays03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printResult(scanner);
    }

    public static int askNumber(Scanner scanner) {
        int number;
        do {
            System.out.println("Ingrese un número positivo: ");
            number = scanner.nextInt();
            scanner.nextLine();
        } while (number <= 0);
        return number;
    }

    public static int[] askArray(Scanner scanner) {
        int arraySize = askNumber(scanner);
        int[] numbers = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            numbers[i] = askNumber(scanner);
        }
        return numbers;
    }

    public static double adverange(Scanner scanner) {
        int[] numbers = askArray(scanner);
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    public static void printResult(Scanner scanner) {
        System.out.println("La media es: " + (adverange(scanner)));
    }
}
