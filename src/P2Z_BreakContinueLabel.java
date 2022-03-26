public class P2Z_BreakContinueLabel {
    public static void main(String[] args) {
        returnLoop();
    }
    //Membuat Class returnLoop()
    static void returnLoop() {
        int x;
        System.out.println("Example Of Return In For-Loop");
        //Perulangan For
        for (x=1; x<=10; x++) {
            //Percabangan If Else
            if (x<5) {
                System.out.printf("%d" ,(x-1));
            }
            else {
                System.out.print("\n");
                return;
            }
            System.out.printf("%d" ,x);
        }
        System.out.print("Tidak Akan Pernah Dieksekusi");

    }
}