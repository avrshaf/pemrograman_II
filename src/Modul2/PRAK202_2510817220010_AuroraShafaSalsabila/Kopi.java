package Modul2.PRAK202_2510817220010_AuroraShafaSalsabila;

public class Kopi {
    String namaKopi;
    String ukuran;
    double harga;

    private String pembeli;

    public Kopi() {
    }

    public void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp. " + harga);
    }

    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }

    public String getPembeli() {
        return this.pembeli;
    }

    public double getPajak() {
        return this.harga * 0.11;
    }
}
