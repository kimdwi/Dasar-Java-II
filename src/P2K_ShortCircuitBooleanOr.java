public class P2K_ShortCircuitBooleanOr {
    public static void main(String[] args) {
        //Menginisialisasikan Variabel
        int a = 5, b= 7;
        //Melakukan Perbandingan Menggunakan Boolean Or Short-Circuit
        if ((a>2) || (b++ <10)) {
            b +=2;
        }
        //Menampilkan Variabel
        System.out.println(b);
    }
}
