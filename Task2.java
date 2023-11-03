import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Masukkan sebuah angka : ");
            number = input.nextInt();

            if (number > 0) {
                System.out.println("Ini adalah angka positif.");
            } else if (number < 0) {
                System.out.println("Ini adalah angka negatif.");
            } else {
                System.out.println("Ini adalah nol. Program berhenti.");
                break; // Keluar dari perulangan while
            }
        }
    }
}

