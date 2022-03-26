import java.util.Scanner;

public class P2_1 {
    public static void main(String[] args) {
        System.out.println("Konversi Bilangan Desimal Ke Bit");
        //Membuat Variabel Dan Scanner
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan Bilangan Desimal : ");
        int bilDesimal = scan.nextInt();
        System.out.println("Susudan Bit Dari " +bilDesimal+ " Adalah ");

        //Variabel Menampung Hasil Bagi
        int sisaBagi [] = new int[8];

        //Perulangan For
        for (int i=0; i<8; i++) {
            sisaBagi [i] = bilDesimal % 2;
            bilDesimal = bilDesimal / 2;
        }

        for (int j=7; j>=0; j--) {
            System.out.print(sisaBagi[j]);
        }
    }
}
