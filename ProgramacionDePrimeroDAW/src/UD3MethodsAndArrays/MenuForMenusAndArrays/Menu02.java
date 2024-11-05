package UD3MethodsAndArrays.MenuForMenusAndArrays;

import java.util.Scanner;

public class Menu02 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("¡Bienvenido!");
        loop();
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

    public static int askOption(){
        System.out.println("Elija una opción:");
        System.out.println("1. Sumar un grupo de números");
        System.out.println("2. Duplicar el valor de un grupo de números");
        System.out.println("3. Salir del programa");
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    public static void firstOperation(){
        System.out.println("el resultado es: " + sumNumbers(askGroup()));
    }

    public static void secondOperation(){
        int[] numbers = doubleNumbers(askGroup());

        System.out.println("El resultado es:");
        for(int number: numbers){
            System.out.print(number + ", ");
        }
        System.out.println(" ");
    }

    public static void loop(){
        int choice;
        do{
            choice = askOption();
            if (choice == 1){
                firstOperation();
            } else if (choice == 2) {
                secondOperation();
            } else if (choice == 3) {
                System.out.println("¡Hasta luego!");
            } else {
                System.out.println("Operación no válida");
            }
        }while (choice != 3);
    }
}
