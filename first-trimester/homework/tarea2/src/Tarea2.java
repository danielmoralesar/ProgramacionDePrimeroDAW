import java.util.Scanner;

public class Tarea2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    }

    public static int elevateNumber(int n1, int n2){
        int elevated = 1;

        for (int i = 0; i < n2; i++) {
            elevated = elevated * n1;
        }

        return elevated;
    }

    public static int[] elevateGroup(int[] numbers, int elevator){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = elevateNumber(numbers[i], elevator);
        }
        return numbers;
    }

    public static int[] askArray(){
        int[] numbers = new int[];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = askNumber();
        }
        return numbers;
    }

    public static int askNumber(){
        int number;
        do{
            System.out.println("Ingrese un número mayor a 1: ");
            number = scanner.nextInt();
            scanner.nextLine();
        }while (number < 1);
        return number;
    }
}