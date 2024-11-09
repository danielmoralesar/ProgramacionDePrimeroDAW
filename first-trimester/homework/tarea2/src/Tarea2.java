import java.util.Scanner;

public class Tarea2 {
    //creamos un scanner global
    public static Scanner scanner = new Scanner(System.in);

    // en el metodo main, entra el menú interactivo como indica el ejercicio.
    public static void main(String[] args) {
        System.out.println("¡Bienvenido!");
        int option;
        do {
            // mostramos el menú de operaciones
            System.out.println("Elija una opción:");
            System.out.println("1. Elevar un grupo de números a potencia");
            System.out.println("2. Elevar un número a potencia");
            System.out.println("3. Salir");
            option = askOption();

            if (option == 1) {
                // opción 1 invoca por una parte la potencia
                // primero pide la potencia
                System.out.println("Ingrese la potencia.");
                int power = askNumberBiggerThanOne();
                // por otra parte, en una misma invocación, se pide el array y se eleva a la potencia ingresada
                int[] bases = elevateGroup(askArray(), power);
                // por último, mostramos el resultado
                System.out.print("El resultado es: ");
                printArray(bases);
            } else if (option == 2) {
                // opcion 2 invoca la base y la potencia por separado y luego se imprime el resultado
                System.out.println("Ingrese la base");
                int base = askNumberBiggerThanOne();
                System.out.println("Ingrese la potencia");
                int power = askNumberBiggerThanOne();
                System.out.println("El resultado es: " + elevateNumber(base, power));
            } else if (option == 3) {
                // opcion 3 se despide del usuario y termina el programa
                System.out.println("¡Hasta luego!");
            } else {
                // opcion 4 notifica que el número no es una opción válida en caso de no ser 1, 2 o 3
                System.out.println("Opción no válida, elija una de la lista");
            }
        } while (option != 3);
    }

    // este metodo eleva un número simple
    public static int elevateNumber(int base, int power) {
        int elevated = 1;
        for (int i = 0; i < power; i++) {
            elevated = elevated * base;
        }
        return elevated;
    }

    // este metodo eleva cada número de un array
    public static int[] elevateGroup(int[] bases, int power) {
        for (int i = 0; i < bases.length; i++) {
            // se usa el anterior metodo para elevar el número en posición i por la potencia deseada
            bases[i] = elevateNumber(bases[i], power);
        }
        return bases;
    }

    // este metodo solicita un array al usuario
    public static int[] askArray() {
        // se usa el metodo siguiente a este para solicitar los números deseados
        System.out.println("Ingrese la cantidad de números para calcular: ");
        int[] numbers = new int[askNumberBiggerThanOne()];
        System.out.println("Ahora, ingrese dichos números: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Le quedan " + (numbers.length - i) + " espacios.");
            numbers[i] = askNumberBiggerThanOne();
        }
        return numbers;
    }

    // este metodo solicita numeros enteros mayores a 1
    public static int askNumberBiggerThanOne() {
        int number;
        do {
            number = scanner.nextInt();
            scanner.nextLine();
            // en el caso de que se ingrese un número menor a 1, se le indica al usuario que debe usar otro número
            if (number <= 1) {
                System.out.println("Solo puede ingresar valores mayores a 1, ingrese otro número:");
            }
        } while (number <= 1);
        return number;
    }

    // debido a que 1 se encuentra como opción, decidí crear este metodo exclusivo para pedirle una operación al usuario
    public static int askOption() {
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    // este metodo muestra en pantalla un array
    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(" ");
    }
}