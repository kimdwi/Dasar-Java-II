public class P2B_OperatorB {
    public static void main(String[] args) {
        //Mendeklarasikan Dan Menginisialisasikan Variabel
        float total = 14000;
        //Menampilkan Variabel
        System.out.println("Original Investsment : $ " +total);
        //Increase By 40 Percents This Year
        //Melakukan Operasi Matematis
        total = total + (total * .4F);
        System.out.println("After One Year : $ "+total);
        //Loses $1,500 The Second Year
        total = total - 1500F;
        System.out.println("Afer Two Years : $ " +total);
        //Increase By 12 Percent The Third Year
        total = total + (total * .12F);
        System.out.println("After Three Years : $ " +total);
    }
}
