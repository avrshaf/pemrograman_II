package soal3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PRAK303_2510817220010_AuroraShafaSalsabila {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        HashMap<String, Mahasiswa> mapMahasiswa = new HashMap<>();

        int pilihan = -1;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("5. Update Nama Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            try {
                pilihan = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                continue;
            }

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = scanner.nextLine();
                    String nim;

                    while (true) {
                        System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                        nim = scanner.nextLine();
                        if (mapMahasiswa.containsKey(nim)) {
                            System.out.println("NIM sudah terdaftar. Silakan masukkan NIM lain.");
                        } else {
                            break;
                        }
                    }

                    Mahasiswa mhsBaru = new Mahasiswa(nama, nim);
                    daftarMahasiswa.add(mhsBaru);
                    mapMahasiswa.put(nim, mhsBaru);
                    System.out.println("Mahasiswa " + nama + " berhasil ditambahkan.");
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nimHapus = scanner.nextLine();

                    if (mapMahasiswa.containsKey(nimHapus)) {
                        Mahasiswa mhsHapus = mapMahasiswa.get(nimHapus);
                        daftarMahasiswa.remove(mhsHapus);
                        mapMahasiswa.remove(nimHapus);
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " berhasil dihapus.");
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
                    String nimCari = scanner.nextLine();

                    if (mapMahasiswa.containsKey(nimCari)) {
                        Mahasiswa mhsDitemukan = mapMahasiswa.get(nimCari);
                        System.out.println("Data Mahasiswa ditemukan:");
                        System.out.println("NIM: " + mhsDitemukan.getNim() + ", Nama: " + mhsDitemukan.getNama());
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
                    }
                    break;

                case 4:
                    if (daftarMahasiswa.isEmpty()) {
                        System.out.println("Daftar Mahasiswa kosong.");
                    } else {
                        System.out.println("Daftar Mahasiswa:");
                        for (Mahasiswa mhs : daftarMahasiswa) {
                            System.out.println("NIM: " + mhs.getNim() + ", Nama: " + mhs.getNama());
                        }
                    }
                    break;

                case 5:
                    System.out.print("Masukkan NIM Mahasiswa yang akan diupdate: ");
                    String nimUpdate = scanner.nextLine();

                    if (mapMahasiswa.containsKey(nimUpdate)) {
                        System.out.print("Masukkan Nama Baru: ");
                        String namaBaru = scanner.nextLine();
                        mapMahasiswa.get(nimUpdate).setNama(namaBaru);
                        System.out.println("Data mahasiswa berhasil diperbarui.");
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nimUpdate + " tidak ditemukan.");
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (pilihan != 0);

        scanner.close();
    }
}