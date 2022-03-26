import java.util.Scanner;

public class P2N_Percangan2IF {
    public static void main(String[] args) {
        //Mendeklarasikan Variabel Inputan
        Scanner input = new Scanner (System.in);
        //Mendeklarsikan Variabel & Memasukkan Inputan Variabel
        System.out.print("Enter A Number : ");
        int intNumber = input.nextInt();
        //Melakukan Proses Percabangan IF
        if (intNumber > 5) {
            //Menampilkan Variabel
            System.out.println("The Number You Entered Is Grater Than 5!");
        }
        System.out.println("Thanks For The Input!");

        System.out.print("\nEnter A Number Between 10-20 : ");
        int a = input.nextInt();

        if (a >= 10 && a <= 20) {
            System.out.println("The Condition Has Been Met.");
        }
        else {
            System.out.println("You Did It Wrong.");
        }

        System.out.println("\nEnter A Number Between 10-20 Or 30-40 : ");
        int b = input.nextInt();

        if (((b >= 10) && (b <= 20) || (b >= 30) && (b <= 40))) {
            System.out.println("The Condition Has Been Met.");
        }
        else {
            System.out.println("You Did It Wrong.");
        }
    }
}
