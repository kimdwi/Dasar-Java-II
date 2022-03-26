import java.util.Scanner;

public class P2X_KalkulatorDoWhile {
    public static void main(String[] args) {
        //Membuat Variabel Dan Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Our Calculator");
        String goOn;

        //Melakukan Perulangan Do-While
        do {
            System.out.println("Enter The First Number : ");
            double a = Double.parseDouble(input.nextLine());
            System.out.print("Enter The Second Number : ");
            double b = Double.parseDouble(input.nextLine());
            System.out.println("Choose One Of The Following Operations : ");
            System.out.println("1 - Addition");
            System.out.println("2 - Substraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.print("Enter Your Choice : ");
            int choice = Integer.parseInt(input.nextLine());
            double result = 0.0;

            //Melakukan Percabgan Menggunakan Switch-Case
            switch (choice) {
                case 1 :
                    result = a + b;
                    break;
                case 2 :
                    result = a - b;
                    break;
                case 3 :
                    result = a * b;
                    break;
                case 4 :
                    result = a / b;
                    break;
                default :
                    break;
            }
            if ((choice > 0) && (choice < 5)) {
                System.out.println("Result : " +result);
            }
            else {
                System.out.println("Invalid Choice");
            }
            System.out.println("Would You Like To Make Another Calculation? [yes/no] : ");
            goOn = input.nextLine();
        }while (goOn.equals("yes"));
        System.out.println("Thank You For Using Our Calculator.");
    }
}
