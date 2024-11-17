package first_trimester_review;

import java.util.Scanner;

public class ex01 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("¡Bienvenido!");
        loop();
    }

    public static int askNumber() {
        int number;
        do {
            number = scanner.nextInt();
            scanner.nextLine();

            if (number < 1) {
                System.out.println("Debe ingresar un número positivo");
            }
        } while (number < 1);
        return number;
    }

    public static int[] askArray() {
        System.out.println("Necesitamos un grupo de números, ingrese la cantidad: ");
        int[] numbers = new int[askNumber()];
        System.out.println("ahora, necesitamos los números de dicho grupo");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Ingrese un número: ");
            System.out.println("le quedan " + (numbers.length - i) + " espacios");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static int findMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int findMin(int[] numbers){
        int min = Integer.MAX_VALUE;
        for (int number : numbers){
            if (number < min){
                min = number;
            }
        }
        return min;
    }

    public static double findAverage(int[] numbers){
        double total = 0;
        for (int number : numbers){
            total += number;
        }
        return (total/numbers.length);
    }

    public static int menu(){
        System.out.println("Elija una opción: ");
        System.out.println("1. Buscar el máximo de entre una lista de números");
        System.out.println("2. Buscar el mínimo de entre una lista de números");
        System.out.println("3. Calcular la media de una lista de números");
        System.out.println("4. Salir");
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    public static void firstOption(){
        System.out.println("el resultado es: " + findMax(askArray()));
    }

    public static void secondOption(){
        System.out.println("el resultado es: " + findMin(askArray()));
    }

    public static void thirdOption(){
        System.out.println("el resultado es: " + findAverage(askArray()));
    }

    public static void loop(){
        int option;
        do{
            option = menu();
            if (option == 1){
                firstOption();
            } else if (option == 2){
                secondOption();
            } else if (option == 3){
                thirdOption();
            } else if (option == 4) {
                System.out.println("¡hasta luego!");
            } else {
                System.out.println("opción no válida, intentelo de nuevo");
            }
        }while (option != 4);
    }
}
