public class P2I_ShortCircuitBooleanAnd {
    public static void main(String[] args) {
        //Mendeklarasikan Variabel
        int a = 5, b = 7;
        //Melakukan Perbandingan Menggunakan Operator Boolean And Short-Circuit
        if((a<2) && (b++ <10)) {
            b +=2;
        }
        //Menampilkan Variabel
        System.out.println(b);
    }
}
