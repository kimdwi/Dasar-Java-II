import java.util.Scanner;

public class P2_3 {
    public static void main(String[] args) {
        //Membuat Scanner Dan Variabel
        Scanner scan = new Scanner (System.in);
        int jamAwal, menitAwal, jamAkhir, menitAkhir, durasiMenit, menitTerakhir,jamTerakhir, durasiJam, total;

        //Mengambil Masukkan Dari User
        System.out.print("Masukkan Jam Awal : ");
        jamAwal = scan.nextInt();
        System.out.print("MAsukkan Menit Awal : ");
        menitAwal = scan.nextInt();
        System.out.print("Masukkan Jam Akhir : ");
        jamAkhir = scan.nextInt();
        System.out.print("Masukkan Menit Akhir : ");
        menitAkhir = scan.nextInt();

        //Melakukan Perulangan For
        if((menitAkhir-menitAwal)<0){
            menitTerakhir = 60 + menitAkhir;
            durasiMenit = menitTerakhir - menitAwal;
            jamTerakhir = jamAkhir - 1;
            durasiJam = jamTerakhir - jamAwal;
            total = (durasiJam * 60) + durasiMenit;
            String pesan = ("Durasi waktu antara pukul "+jamAwal+ " : " +menitAwal+ " s/d pukul " +jamAkhir+ " : " +menitAkhir+ " adalah " +total+ "menit");
            System.out.println(pesan);
        }

        else if((menitAwal - menitAkhir)<0){
            menitTerakhir = 60 + menitAkhir;
            durasiMenit = menitTerakhir - menitAwal;
            jamTerakhir = jamAkhir - 1;
            durasiJam = jamTerakhir - jamAwal;
            total = (durasiJam * 60) + durasiMenit;
            String end=("Durasi waktu antara pukul " +jamAwal+ " : " +menitAwal+ " s/d pukul " +jamAkhir+ " : " +menitAkhir+ " adalah " +total+ " menit ");
            System.out.println(end);
        }


    }
}

