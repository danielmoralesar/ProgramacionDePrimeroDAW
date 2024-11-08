import java.util.Scanner;

public class Tarea2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("¡Bienvenido!");
        int option;
        do {
            System.out.println("Elija una opción:");
            System.out.println("1. Elevar un grupo de números a potencia");
            System.out.println("2. Elevar un número a potencia");
            System.out.println("3. Salir");
            option = askNumber();

            if (option == 1) {
                System.out.println("Ingrese la potencia.");
                int power = askNumber();
                printArray(elevateGroup(askArray(), power));
            } else if (option == 2) {
                System.out.println("Ingrese la base");
                int base = askNumber();
                System.out.println("Ingrese la potencia");
                int power = askNumber();
                System.out.println(elevateNumber(base, power));
            } else if (option == 3) {
                System.out.println("¡Hasta luego!");
            } else {
                System.out.println("Opción no válida, elija una de la lista");
            }
        } while (option != 3);
    }

    public static int elevateNumber(int base, int power) {
        int elevated = 1;
        for (int i = 0; i < power; i++) {
            elevated = elevated * base;
        }
        return elevated;
    }

    public static int[] elevateGroup(int[] numbers, int power) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = elevateNumber(numbers[i], power);
        }
        return numbers;
    }

    public static int[] askArray() {
        System.out.println("Ingrese la cantidad de números para calcular.");
        int[] numbers = new int[askNumber()];
        System.out.println("Ahora, ingrese dichos números.");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Le quedan " + (numbers.length - i) + " espacios.");
            numbers[i] = askNumber();
        }
        return numbers;
    }

    public static int askNumber() {
        int number;
        do {
            number = scanner.nextInt();
            scanner.nextLine();
        } while (number < 1);
        return number;
    }

    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(" ");
    }
}