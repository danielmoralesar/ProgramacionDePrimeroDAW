package UD2ControlStructures.forexercises;

import java.util.Scanner;

public class For01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Ingrese un número: ");
            number = scanner.nextInt();
            scanner.nextLine();
        } while (number < 1);

        System.out.println("Ahora ingrese una palabra: ");
        String message = scanner.nextLine();

        for (int i = 0; i < number; i++) {
            System.out.println(message);
        }
    }
}
