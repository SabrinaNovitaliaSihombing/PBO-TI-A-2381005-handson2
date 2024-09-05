package latihansoal;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        // membuat nilai maksimun dari 3 bilangan
        int[] bilangan = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < bilangan.length; i++) {
            System.out.println("Masukkan Bilangan ke-" + (i + 1) + " : ");
            bilangan[i] = scanner.nextInt();
        }

        int maxValue = bilangan[0];
        for (int i = 1; i < bilangan.length; i++) {
            if (maxValue < bilangan[i]) {
                maxValue = bilangan[i];
            }
        }

        System.out.println("Bilangan Terbesar adalah: " + maxValue);

        scanner.close();

    }
}
