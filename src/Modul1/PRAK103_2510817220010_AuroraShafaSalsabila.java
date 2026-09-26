package Modul1;

import java.util.Scanner;

public class PRAK103_2510817220010_AuroraShafaSalsabila {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahDeret = input.nextInt();
        int angkaAwal = input.nextInt();

        int urutan = 1;

        do {
            if (angkaAwal % 2 == 1) {
                System.out.print(angkaAwal);

                if (urutan < jumlahDeret) {
                    System.out.print(", ");
                }

                urutan++;
            }

            angkaAwal++;
        } while (urutan <= jumlahDeret);

        input.close();
    }
}