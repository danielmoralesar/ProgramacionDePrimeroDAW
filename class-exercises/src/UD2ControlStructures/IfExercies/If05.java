package UD2ControlStructures.IfExercies;

import java.util.Scanner;

public class If05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int a = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese otro número");
        int b = scanner.nextInt();
        scanner.nextLine();

        if (a > b) {
            System.out.println("la suma de ambos números es " + (a + b));
        } else if (b == a) {
            System.out.println("la resta entre ambos números es " + (a - b));
        } else {
            System.out.println("Ingrese otro número");
            int c = scanner.nextInt();
            scanner.nextLine();

            if (c > (a + b)) {
                System.out.println(c + " es mayor que " + a + " y " + b + " juntos");
            } else if (c < (a + b)) {
                System.out.println(c + " es menor que " + a + " y " + b + " juntos");
            } else {
                System.out.println(c + " es igual que " + a + " y " + b + " juntos");
            }
        }
    }
}
