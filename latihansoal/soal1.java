package latihansoal;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        // membuat nilai maksimun dari 2 bilangan
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan angak pertama: ");
        int number1 = scanner.nextInt();

        System.out.println("Masukkan angka kedua: ");
        int number2 = scanner.nextInt();

        int max = number1;

        if(max < number2){
            max = number2;
        }

        System.out.println("Nilai maksimum antara " + number1 + " dan " + number2 + " adalah " + max);

        scanner.close();

    }
}
