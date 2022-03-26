import java.util.Scanner;

public class P2_2 {
    public static void main(String[] args) {
        System.out.println("Program Konversi Bilangan Biner Ke Desimal");
        //Membuat Scanner & Variabel
        Scanner scan = new Scanner (System.in);

        //Mengambil Inputan Dari User
        System.out.print("Masukkan Bilangan Biner : ");
        String bilBiner = scan.nextLine();

        //Menampilkan Hasil
        System.out.println("Bilangan Desimal Dari " +bilBiner+ " Adalah " +Integer.parseInt(bilBiner,2));
    }
}
