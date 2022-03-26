import java.util.Scanner;

public class P2_9 {
    public static void main(String[] args) {
        //Membuat Variabel Dan Scanner
        int tahun;
        Scanner scan = new Scanner(System.in);

        //Mengambil Inputan Dari User
        System.out.print("Masukkan tahun 1900 - 2005: ");
        tahun = scan.nextInt();

        //Percabangan If Else-If
        if ((tahun >= 1900) & (tahun <= 2005)) {
            if (tahun % 400 == 0) {
                //Menampilkan Hasil
                System.out.print(tahun + " Adalah Tahun Kabisat\n");
            } else if (tahun % 100 == 0) {
                System.out.print(tahun + " Bukan Tahun Kabisat\n");
            } else if (tahun % 4 == 0) {
                System.out.print(tahun + " Adalah Tahun Kabisat\n");
            } else {
                System.out.print(tahun + " Bukan Tahun Kabisat\n");
            }
        } else if (tahun > 2005) {
            System.out.println("Maaf, Tahun Inputan Diatas 2005");
        } else if (tahun < 1900) {
            System.out.println("Maaf, Tahun Inputan Dibawah 1900");
        }
    }
}