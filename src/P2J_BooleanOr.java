public class P2J_BooleanOr {
    public static void main(String[] args) {
        //Mendeklarasikan & Menginisialisasikan Variabel
        int a = 5, b = 7;
        //Melakukan Perbandingan Mengggunakan Boolean Or "|"
        if ((a>2) | (b++ <10)) {
            b +=2;
        }
        //Menampilkan Variabel
        System.out.println(b);
    }
}
