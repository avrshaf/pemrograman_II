package Modul1;

import java.util.Scanner;

public class PRAK105_2510817220010_AuroraShafaSalsabila {
    public static final double PHI = 3.14;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double jariJari = input.nextDouble();
        while (jariJari <= 0) {
            System.out.print("Jari-jari harus lebih dari 0, masukkan kembali: ");
            jariJari = input.nextDouble();
        }

        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();
        while (tinggi <= 0) {
            System.out.print("Tinggi harus lebih dari 0, masukkan kembali: ");
            tinggi = input.nextDouble();
        }

        double hasilVolume = PHI * jariJari * jariJari * tinggi;

        System.out.printf("Volume tabung dengan jari-jari %.1f cm\n", jariJari);
        System.out.printf("dan tinggi %.1f cm adalah %.3f m3\n", tinggi, hasilVolume);

        input.close();
    }
}