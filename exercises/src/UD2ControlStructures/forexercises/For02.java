package UD2ControlStructures.forexercises;

import java.util.Scanner;

public class For02 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("¡Bienvenido!");
        int number1 = askNumber();
        int number2 = askNumber();

        if (number1 > number2) {
            for (int i = 0; i <= (number1-number2); i++) {
                System.out.println(number2 + i);
            }
        } else if (number2 > number1) {
            for (int i = 0; i <= (number2-number1); i++) {
                System.out.println(i + number1);
            }
        } else {
            System.out.println("debe haber una diferencia entre ambos números");
            System.out.println("Intentelo de nuevo");
        }
    }

    public static int askNumber() {
        System.out.println("Ingrese un número");
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }
}
