package UD2ControlStructures.IfExercies;

import java.util.Scanner;

public class If04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba una palabra: ");
        String word = scanner.nextLine();

        if (word.length() < 8) {
            System.out.println("Demasiado pequeño");
        } else if (word.length() > 8) {
            System.out.println("Demasiado grande");
        } else {
            System.out.println("Es válido");
        }
    }
}
