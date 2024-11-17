package UD2ControlStructures.switchexersices;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra");
        String word = scanner.nextLine();

        switch (word.length()){
            case 8:
                System.out.println("es válido");
                break;
            default:
                System.out.println("no es válido");
                break;
        }
    }

}
