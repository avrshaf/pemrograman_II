package soal1;

public class Anjing extends HewanPeliharaan {
    private String warnabulu;
    private String[] kemampuan;

    public Anjing(String n, String r, String w, String[] k) {
        super(n, r);
        this.warnabulu = w;
        this.kemampuan = k;
    }

    public void displayDetailAnjing() {
        super.display();
        System.out.println("Memiliki warna bulu: " + this.warnabulu);
        System.out.print("Memiliki kemampuan: ");
        for (int i = 0; i < kemampuan.length; i++) {
            System.out.print(kemampuan[i] + (i < kemampuan.length - 1 ? " " : ""));
        }
        System.out.println();
    }
}