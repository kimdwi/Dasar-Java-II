public class P2_7 {
    public static void main(String[] args) {
        //Membuat Variabel
        int i = 0;
        int x = 0;
        System.out.print("Deret : ");

        //Perulangan While
        while(x<20){
            //Percabangan If
            if (i%3==0){
                i++;
            }
            x = 2 * i;
            //Mencetak Hasil
            System.out.print(" "+ x +", ");
            i++;}
        System.out.println(" ");
    }
}
