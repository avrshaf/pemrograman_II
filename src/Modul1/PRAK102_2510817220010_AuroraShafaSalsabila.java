package Modul1;

import java.util.Scanner;

public class PRAK102_2510817220010_AuroraShafaSalsabila {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka = input.nextInt();

        int deret = 1;

        while (deret <= 11) {
            if (angka % 5 == 0) {
                System.out.print((angka / 5) - 1);
            } else {
                System.out.print(angka);
            }

            if (deret < 11) {
                System.out.print(", ");
            }

            angka++;
            deret++;
        }

        input.close();
    }
}