import java.util.Scanner;

public class P2P_KalkulatorIF {
    public static void main(String[] args) {
        //Membuat Variabel & Scanner
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome To Our Calculator");
        System.out.println("Enter The First Number : ");
        double a = input.nextDouble();
        System.out.println("Enter The Second Number : ");
        double b = input.nextDouble();
        //Menampilkan Pilihan Operasi Matematika
        System.out.println("Choose One Of The Following Operations : ");
        System.out.println("1 - Addition");
        System.out.println("2 - Substraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        int choice = input.nextInt();
        double result = 0.0;

        //Melakukan Percabangan if - else if
        if (choice == 1) {
            result = a + b;
        }
        else if (choice == 2) {
            result = a - b;
        }
        else if (choice == 3) {
            result = a * b;
        }
        else if (choice == 4) {
            result = a / b;
        }

        //Mencetak Hasil
        if ((choice > 0) && (choice < 5)) {
            System.out.println("Result : " +result);
        }
        else {
            System.out.println("Invalid Choice");
        }

        System.out.println("Thank You For Using Our Calculator");
    }
}
