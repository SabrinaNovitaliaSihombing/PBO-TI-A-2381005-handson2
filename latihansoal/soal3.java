package latihansoal;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        // membuat kalkulator sederhana menggunakan switch case
        int operand[] = new int[2];
        int result = 0;
        int operatorChoice = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < operand.length; i++) {
            System.out.println("Masukkan Bilangan ke-" + (i + 1) + " : ");
            operand[i] = scanner.nextInt();
        }

        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3.Bagi");
        System.out.println("4. Kali");
        System.out.println("5. Modulo");
        System.out.println("Pilih Tipe Operator (1 - 5) : ");
        operatorChoice = scanner.nextInt();

        switch (operatorChoice) {
            case 1:
                result = operand[0] + operand[1];
                break;
            case 2:
                result = operand[0] - operand[1];
                break;
            case 3:
                result = operand[0] / operand[1];
                break;
            case 4:
                result = operand[0] * operand[1];
                break;
            case 5:
                result = operand[0] % operand[1];
                break;
            default:
                System.out.println("Masukkan nomor antara 1 - 5: ");
                System.exit(0);
        }
        System.out.println("Hasil Operasi adalah: " + result);
    }
}
