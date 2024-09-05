package binaryoperator;

public class Assingment {
    public static void main(String[] args) {
        // 1. Operator assingment dasar
        int angka = 10;
        String nama = "Alice";

        System.out.println("Nilai angka : " + angka);
        System.out.println("Nilai nama : " + nama);

        // 2. operator assingment aritmatika
        int x = 5;
        x += 3;
        System.out.println("Nilai x Setelah += 3: " + x);

        int y = 10;
        y -= 2 ;
        System.out.println("Nilai y Setelah -= 2: " + y);

        int z = 4;
        z *= 4;
        System.out.println("Nilai z Setelah *= 5: " + z);

        int a = 20;
        a /= 4;
        System.out.println("Nilai a Setelah /= 4: " + a);

        int b = 13;
        b %= 5;
        System.out.println("Nilai x Setelah %= 5: " + b);
    }
}
