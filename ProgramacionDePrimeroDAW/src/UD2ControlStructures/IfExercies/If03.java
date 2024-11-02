package UD2ControlStructures.IfExercies;

import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba un número: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num < 0) {
            System.out.println("Es negativo");
        } else if (num > 0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("No es positivo ni negativo");
        }
    }
}
