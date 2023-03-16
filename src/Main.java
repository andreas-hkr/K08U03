import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ange ett tal: ");
        int number = input.nextInt();

        if (isPrime(number)) {
            System.out.println("Talet är ett primtal.");
        } else {
            System.out.println("Talet är inte ett primtal.");
        }
    }
}