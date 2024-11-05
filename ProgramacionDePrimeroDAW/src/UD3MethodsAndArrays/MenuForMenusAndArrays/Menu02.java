package UD3MethodsAndArrays.MenuForMenusAndArrays;

import java.util.Scanner;

public class Menu02 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    }

    public static int askNumber() {
        int number;
        do {
            System.out.println("Ingrese un número: ");
            number = scanner.nextInt();
            scanner.nextLine();
        } while (number < 0);
        return number;
    }

    public static int[] askGroup() {
        System.out.println("Defina la cantidad de números: ");
        int[] group = new int[askNumber()];

        System.out.println("Ahora, ingrese los números: ");
        for (int i = 0; i < group.length; i++) {
            group[i] = askNumber();
        }
        return group;
    }

    public static int sumNumbers(int[] group) {
        int sum = 0;
        for (int number : group) {
            sum = sum + number;
        }
        return sum;
    }

    public static int[] doubleNumbers(int[] group){
        for (int i = 0; i < group.length; i++) {
            group[i] = group[i]*2;
        }
        return group;
    }
}
