package UD2ControlStructures.IfExercies;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num == 0){
           System.out.println("No es par ni impar");
        } else if (num%2 == 1) {
            System.out.println("Es impar");
        } else if (num%2 == 0){
            System.out.println("Es par");
        }
    }
}
