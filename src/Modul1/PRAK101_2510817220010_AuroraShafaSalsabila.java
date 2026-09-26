package Modul1;

import java.util.Scanner;

public class PRAK101_2510817220010_AuroraShafaSalsabila {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        while (!input.hasNextInt()) {
            System.out.print("Input harus angka! Masukkan Tanggal Lahir: ");
            input.next();
        }
        int tanggal = input.nextInt();
        while (tanggal < 1 || tanggal > 31) {
            System.out.print("Tanggal tidak valid (1-31), masukkan lagi: ");
            tanggal = input.nextInt();
        }

        System.out.print("Masukkan Bulan Lahir: ");
        while (!input.hasNextInt()) {
            System.out.print("Input harus angka! Masukkan Bulan Lahir: ");
            input.next();
        }
        int bulan = input.nextInt();
        while (bulan < 1 || bulan > 12) {
            System.out.print("Bulan tidak valid (1-12), masukkan lagi: ");
            bulan = input.nextInt();
        }

        System.out.print("Masukkan Tahun Lahir: ");
        while (!input.hasNextInt()) {
            System.out.print("Input harus angka! Masukkan Tahun Lahir: ");
            input.next();
        }
        int tahun = input.nextInt();

        int batasHari = 31;
        if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11) {
            batasHari = 30;
        } else if (bulan == 2) {
            if ((tahun % 400 == 0) || (tahun % 4 == 0 && tahun % 100 != 0)) {
                batasHari = 29;
            } else {
                batasHari = 28;
            }
        }

        while (tanggal > batasHari || tanggal < 1) {
            System.out.println("Bulan " + bulan + " tahun " + tahun + " hanya sampai tanggal " + batasHari + "!");
            System.out.print("Masukkan Tanggal Lahir yang benar: ");
            tanggal = input.nextInt();
        }

        System.out.print("Masukkan Tinggi Badan: ");
        while (!input.hasNextInt()) {
            System.out.print("Input harus angka! Masukkan Tinggi Badan: ");
            input.next();
        }
        int tinggiBadan = input.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        while (!input.hasNextDouble()) {
            System.out.print("Input harus angka! Masukkan Berat Badan: ");
            input.next();
        }
        double beratBadan = input.nextDouble();

        String[] namaBulan = {"", "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        System.out.println("Nama Lengkap " + nama + ", Lahir di " + tempatLahir + " pada Tanggal " + tanggal + " " + namaBulan[bulan] + " " + tahun);
        System.out.println("Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram");

        input.close();
    }
}