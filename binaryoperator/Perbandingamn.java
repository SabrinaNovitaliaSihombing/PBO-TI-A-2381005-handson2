package binaryoperator;

public class Perbandingamn {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // sama dengan
        boolean hasilsamaDengan = (a == b);
        System.out.println("a == b: " + hasilsamaDengan);

        // tidak sama dengan
        boolean hasiltidaksamaDengan = (a != b);
        System.out.println("a != b: " + hasiltidaksamaDengan);

        // lebih besar dari
        boolean hasilLebihBesarDari = (a > b);
        System.out.println("a > b: " + hasilLebihBesarDari);

        // lebih kecil dari
        boolean hasilLebihKecilDari = (a < b);
        System.out.println("a < b: " + hasilLebihKecilDari);

        // lebih besar atau sama dengan
        boolean hasilLebihBesarSamaDengan = (a >= b);
        System.out.println("a >= b: " + hasilLebihBesarSamaDengan);

        // lebih kecil atau sama dengan
        boolean hasilLebihKecilSamaDengan = (a <= b);
        System.out.println("a <= b: " + hasilLebihKecilSamaDengan);


    }
}
