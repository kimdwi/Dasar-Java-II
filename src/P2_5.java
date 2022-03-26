import java.util.Scanner;

public class P2_5 {
    public static void main(String[] args) {
        //Membuat Variabel & Scanner
        Scanner scan = new Scanner (System.in);
        int n,hitung,faktorial = 1;

        //Mengambil Inputan Dari User
        System.out.print("Masukkan Bilangan Faktorial : ");
        n = scan.nextInt();

        //Percabangan If Else
        if (n < 0) {
            System.out.println("Angka Tidak Boleh Dibawah 0!");
        }
        else {
            //Perulangan For
            for (hitung=1; hitung<=n; hitung++) {
                faktorial = faktorial * hitung;
            }
            System.out.println("Faktorial Dari Angka " +n+ "! Adalah : " +faktorial);
        }
    }
}
