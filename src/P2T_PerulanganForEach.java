public class P2T_PerulanganForEach {
    public static void main(String[] args) {
        //Membuat Array
        int arrAngka [] = {10,11,12,13,14,15};

        //Melakukan Perulangan For-Each
        for (int angka : arrAngka) {
            System.out.printf("%d" , angka);
        }
        System.out.println("\n");
        String [] cars = {"Volvo","BMW","Ford","Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
