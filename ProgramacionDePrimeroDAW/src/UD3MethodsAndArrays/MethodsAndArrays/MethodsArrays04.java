package UD3MethodsAndArrays.MethodsAndArrays;

import java.util.Scanner;

public class MethodsArrays04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primer grupo: ");
        int[] firstArray = askArray(scanner);
        int[] firstInverted = invertArray(firstArray);
        printArray(firstInverted);

        System.out.println("Segundo grupo: ");
        int[] secondArray = askArray(scanner);
        int[] secondInverted = invertArray(secondArray);
        printArray(secondInverted);

        System.out.println("Union de grupos: ");
        int[] joined = joinArrays(firstInverted, secondInverted);
        printArray(joined);

    }

    public static int[] askArray(Scanner scanner) {
        int size;

        do {
            System.out.println("¿Cuantos números quiere ingresar?");
            size = scanner.nextInt();
            scanner.nextLine();
        } while (size <= 0);

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Ingrese un número");
            System.out.println("Le quedan " + (size - i) + " espacios.");
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }

    public static int[] invertArray(int[] array){
        int size = array.length;

        int[] reversed = new int[size];

        for (int i = 0; i < size; i++) {
            reversed[i] = array[(size - i - 1)];
        }

        return reversed;
    }

    public static int[] joinArrays(int[] firstArray, int[] secondArray){
        int firstSize = firstArray.length;
        int secondSize = secondArray.length;

        int[] joined = new int[firstSize+secondSize];

        for (int i = 0; i < firstSize; i++) {
            joined[i] = firstArray[i];
        }
        for (int i = 0; i < secondSize; i++) {
            joined[i+firstSize] = secondArray[i];
        }
        return joined;
    }

    public static void printArray(int[] array){
        int size = array.length;

        for (int i = 0; i < size; i++) {
            System.out.println("posición " + i + " es " + array[i]);
        }
    }
}
