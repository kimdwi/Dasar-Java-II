import java.util.Scanner;

public class P2O_HitungGradeIF {
    public static void main(String[] args) {
        //Membuat Variabel Dan Scanner
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);

        //Mengambil Input
        System.out.print("Inputkan Nilai : ");
        nilai = scan.nextInt();

        //Hitung Gradenya
        if (nilai >= 85) {
            grade = "A";
        }
        else if (nilai >= 75) {
            grade = "B+";
        }
        else  if (nilai >= 65) {
            grade = "B";
        }
        else if (nilai >= 60) {
            grade = "C+";
        }
        else if (nilai >= 55) {
            grade = "C";
        }
        else if (nilai >= 40) {
            grade = "D";
        }
        else {
            grade = "E";
        }

        //Cetak Hasilnya
        System.out.println("Grade : " +grade);
    }
}
