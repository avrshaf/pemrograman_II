package soal1;

public class Kucing extends HewanPeliharaan {
    private String warnabulu;

    public Kucing(String r, String n, String w) {
        super(r, n);
        this.warnabulu = w;
    }

    public void displayDetailKucing() {
        super.display();
        System.out.println("Memiliki warna bulu: " + this.warnabulu);
    }
}