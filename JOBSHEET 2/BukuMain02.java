package Jobsheet 2;

public class BukuMain02 {
    public static void main(String[] args) {
        Buku02 bk1 = new Buku02();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual (jm1:5);
        bk1.gantiHarga (hrg:60000);
        bk1.tampilInformasi();
    }
}
