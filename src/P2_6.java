import java.util.Scanner;

public class P2_6 {
    public static void main(String[] args) {
        //Membuat Scanner & Variabel
        Scanner scan = new Scanner (System.in);
        int batas, bilSebelum, bilSekarang, fibonacci;
        System.out.print("Masukkan Banyak Deret Fibonacci : ");
        batas = scan.nextInt();
        bilSebelum = 1;
        bilSekarang = 1;
        fibonacci = 1;

        //Perulangan For
        for (int i=1; i<=batas; i++) {
            System.out.print(bilSekarang+ " ");
            fibonacci = bilSebelum + bilSekarang;
            bilSebelum = bilSekarang;
            bilSekarang = fibonacci;
        }
    }
}
