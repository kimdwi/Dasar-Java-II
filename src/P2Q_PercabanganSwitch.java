import java.util.Scanner;

public class P2Q_PercabanganSwitch {
    public static void main(String[] args) {
        //Membuat Variabel Dan Scanner
        String lampu;
        Scanner scan = new Scanner (System.in);

        //Mengamil Input
        System.out.print("Inputkan Nama Warna : ");
        lampu = scan.nextLine();

        //Melakukan Percabangan Menggunakan Switch
        switch (lampu) {
            case  "merah" :
                System.out.println("Lampus Merah, Berhenti!");
                break;
            case "kuning" :
                System.out.println("Lampu Kuning, Harap Hati - Hati!");
                break;
            case "hijau" :
                System.out.println("Lampu Hijau, Silahkan Jalan!");
                break;
            default:
                System.out.println("Warna Lampu Salah!");
        }
    }
}
