package Modul2.PRAK201_2510817220010_AuroraShafaSalsabila;

public class Buah {
    private String namaBuah;
    private double berat;
    private double harga;
    private double jumlahBeli;

    public Buah(String namaBuah, double berat, double harga, double jumlahBeli) {
        this.namaBuah = namaBuah;
        this.berat = berat;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
    }

    private double getHargaPerKg() {
        return this.harga / this.berat;
    }

    public void hitungDanTampilkan() {
        double hargaSebelumDiskon = this.jumlahBeli * getHargaPerKg();

        int kelipatanDiskon = (int) (this.jumlahBeli / 4);

        double totalDiskon = kelipatanDiskon * (4 * getHargaPerKg()) * 0.02;

        double hargaSetelahDiskon = hargaSebelumDiskon - totalDiskon;

        System.out.println("Nama Buah: " + this.namaBuah);
        System.out.println("Berat: " + this.berat);
        System.out.println("Harga: " + this.harga);
        System.out.println("Jumlah Beli: " + this.jumlahBeli + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", hargaSebelumDiskon);
        System.out.printf("Total Diskon: Rp%.2f\n", totalDiskon);
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n\n", hargaSetelahDiskon);
    }
}