package UD2ControlStructures.switchexersices;

import java.util.Scanner;

public class Switch02 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escriba una operación");
        String operacion = scanner.nextLine();

        switch (operacion) {
            case "+":
                int a = askNumber();
                int b = askNumber();
                System.out.println("el resultado es " + (a + b));
                break;
            case "-":
                int c = askNumber();
                int d = askNumber();
                System.out.println("el resultado es " + (c - d));
                break;
            default:
                System.out.println("operación no válida:");
        }
    }

    public static int askNumber() {
        System.out.println("ingrese un número ");
        return scanner.nextInt();
    }
}
