public class P2Y_BreakContinue {
    public static void main(String[] args) throws NumberFormatException{
        //Membuat Variabel
        int x;
        System.out.println("Example Of Break And Continue In For-Loop");

        //Perulangan For
        for (x = 1; x <=10; x++) {
            if (x == 7) {
                break;
            }
            if (x == 3) {
                continue;
            }
            System.out.printf("%d" ,x);
        }
        System.out.println('\n');
    }
}