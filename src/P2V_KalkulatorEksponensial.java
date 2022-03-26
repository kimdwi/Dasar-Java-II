import java.util.Scanner;

public class P2V_KalkulatorEksponensial {
    public static void main(String[] args) {
        //Membuat Scanner Dan Variabel
        Scanner input = new Scanner (System.in);
        System.out.println("Simple Multiplication Table Using Loops : ");
        System.out.println("Exponent Calculator");
        System.out.println("========================");
        System.out.print("Enter The Base : ");
        int a = input.nextInt();
        System.out.print("Enter The Exponent : ");
        int n = input.nextInt();

        //Melakukan Perulangan For
        int result = a;
        for (int i=1; i<=n-1; i++) {
            result = result * a;
        }
        //Menampilkan Hasil
        System.out.printf("Result : %d\n" , result);
        System.out.println("Thank You For Using Our Exponent Calculator");
    }
}
