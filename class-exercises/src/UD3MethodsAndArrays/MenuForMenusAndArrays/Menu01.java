package UD3MethodsAndArrays.MenuForMenusAndArrays;

import java.util.Scanner;

public class Menu01 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("¡Bienvenido!");
        menu();
    }

    public static int askNumber() {
        int number;
        do {
            System.out.println("Ingrese un número");
            number = scanner.nextInt();
            scanner.nextLine();
        } while (number <= 0);
        return number;
    }

    public static int[] askArray() {
        System.out.println("Defina la cantidad de números:");
        int[] numbers = new int[askNumber()];

        System.out.println("Ahora, ingrese los números solicitados");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = askNumber();
        }
        return numbers;
    }

    public static int findMax(int[] numbers) {
        int max = 0;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int findMin(int[] numbers) {
        int min = findMax(numbers);
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int calculateAdverange(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total = total + number;
        }
        return total / numbers.length;
    }

    public static int askOption() {
        System.out.println("Elija una operación: ");
        System.out.println("1. Buscar el máximo de entre una lista de números");
        System.out.println("2. Buscar el mínimo de entre una lista de números");
        System.out.println("3. Calcular la media de una lista de números");
        System.out.println("4. Salir");
        int option = scanner.nextInt();
        scanner.nextLine();

        return option;
    }

    public static void option1() {
        System.out.println("El número más alto es: " + findMax(askArray()));
    }

    public static void option2() {
        System.out.println("El número más pequeño es " + findMin(askArray()));
    }

    public static void option3() {
        System.out.println("La media es: " + calculateAdverange(askArray()));
    }

    public static void menu() {
        int choice;

        do {
            choice = askOption();
            if (choice == 1) {
                option1();
            } else if (choice == 2) {
                option2();
            } else if (choice == 3) {
                option3();
            } else if (choice == 4) {
                System.out.println("¡Hasta luego!");
            } else {
                System.out.println("Opción no válida.");
            }
        } while (choice != 4);
    }
}
