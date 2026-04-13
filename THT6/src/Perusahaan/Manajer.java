package perusahaan;

public class Manajer extends Karyawan {
    private String divisi;
    private int jumlahAnggotaTim;

    public Manajer(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja, String divisi, int jumlahAnggotaTim) {
        super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja);
        this.divisi = divisi;
        this.jumlahAnggotaTim = jumlahAnggotaTim;
    }

    @Override
    public double hitungGajiTotal() {
        double gajiBase = super.hitungGajiTotal();
        // Tunjangan manajerial: 300rb per anak buah
        double tunjangan = jumlahAnggotaTim * 300000;
        double total = gajiBase + tunjangan;

        // Bonus ekstra 15% kalo performa gacor (rating > 4.5)
        if (getRatingKinerja() > 4.5) {
            total *= 1.15;
        }
        return total;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Manajer Divisi " + divisi);
        System.out.println("Jumlah Anggota: " + jumlahAnggotaTim);
    }
}