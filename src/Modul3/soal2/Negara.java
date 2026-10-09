package soal2;

import java.util.HashMap;

public class Negara {
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggal, int bulan, int tahun) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggal;
        this.bulanKemerdekaan = bulan;
        this.tahunKemerdekaan = tahun;
    }

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
    }

    public void tampilkanDetail(HashMap<Integer, String> mapBulan) {
        String gelar = "";

        if (jenisKepemimpinan.equalsIgnoreCase("presiden")) {
            gelar = "Presiden";
        } else if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
            gelar = "Raja";
        } else if (jenisKepemimpinan.equalsIgnoreCase("perdana menteri")) {
            gelar = "Perdana Menteri";
        }

        System.out.println("Negara " + nama + " mempunyai " + gelar + " bernama " + namaPemimpin);

        if (!jenisKepemimpinan.equalsIgnoreCase("monarki")) {
            String namaBulan = mapBulan.get(bulanKemerdekaan);
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggalKemerdekaan + " " + namaBulan + " " + tahunKemerdekaan);
        }
        System.out.println();
    }
}