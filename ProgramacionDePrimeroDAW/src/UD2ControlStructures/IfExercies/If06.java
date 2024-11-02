package UD2ControlStructures.IfExercies;

import java.util.Scanner;

public class If06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba una operación: ");
        String operation = scanner.nextLine();

        if(operation.equals("+")){
            System.out.println("Ingrese un número: ");
            int a = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingrese otro número: ");
            int b = scanner.nextInt();
            scanner.nextLine();

            System.out.println("La suma de ambos números es "+ (a+b));
        } else if(operation.equals("-")){
            System.out.println("Ingrese un número: ");
            int a = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingrese otro número: ");
            int b = scanner.nextInt();
            scanner.nextLine();

            System.out.println("La resta de ambos números es "+ (a-b));
        }
    }
}
