package UD2ControlStructures.IfExercies;

import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese otro número: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        if (num1 > num2){
            System.out.println(num1 +" Es mayor");
        } else if (num2 > num1){
            System.out.println(num1 + "es menor");
        } else {
            System.out.println("Son iguales");
        }
    }
}
