package UD2ControlStructures.switchexersices;

import java.util.Scanner;

public class Switch01 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hola, ingrese la hora:");
        menu(askNumber());
    }
    public static int askNumber(){
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }
    public static void menu(int number){
        switch (number){
            case 6, 7, 8, 9, 10, 11, 12:
                System.out.println("Buenos días");
                break;
            case 13, 14, 15, 16, 17, 18, 19, 20:
                System.out.println("Buenas tardes");
                break;
            case 21, 22, 23, 0, 1, 2, 3, 4, 5:
                System.out.println("Buenas noches");
                break;
            default:
                System.out.println("Hora inválida");
        }
    }
}
