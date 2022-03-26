import java.util.Scanner;

public class P2M_PercabanganIf {
    public static void main(String[] args) {
        //if
        if (15 > 5) {
            System.out.println("True");
        }
        System.out.println("The Program Continues Here...");
        //if - else
        //Mendeklarasikan & Menginisialisasikan Variabel
        int a = 5;
        int b = 2;
        int max;
        if (a > b) {
            max = a;
        }
        else {
            max = b;
        }
        System.out.println("Maximum Of a Or b Is " +max);
        //if - else if
        int myVar = 0; //The Variable Is Initalized With A Value Of 0
        if (myVar == 0) { //If The Value Is 0, We Change Its Value To 1
            myVar = 1;
        }
        else if (myVar == 1) { //If The Value Is 1, We Change Its Value To 0
            myVar = 0;
        }
        else {
            myVar = -1;
        }
    }
}
