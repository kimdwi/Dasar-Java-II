import java.util.InputMismatchException;
import java.util.Scanner;

public class P2Z_ExceptionHanding {
    public static void main(String[] args) {
        //Membuat Scanner
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Masukkan NIlai (Integer) : ");
            int value = input.nextInt();
            System.out.println("Hasil Nilai Masukkan x 2 = " +(value*2));
        }catch (InputMismatchException ex) {
            System.out.println("Periksa Kembali Inputan Anda.");
        }finally {
            System.out.println("Terima kasih!");
        }
    }
}

