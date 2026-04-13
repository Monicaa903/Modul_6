package perusahaan;

public class Karyawan {
    // Atribut dibuat private biar aman (Encapsulation)
    private String idKaryawan;
    private String nama;
    private int tahunMasuk;
    private double gajiPokok;
    private double ratingKinerja;

    // Konstruktor buat isi data awal
    public Karyawan(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.gajiPokok = gajiPokok;
        
        // Validasi rating: kalau ngaco (di luar 1-5), kita kasih default 3.0
        if (ratingKinerja < 1.0 || ratingKinerja > 5.0) {
            this.ratingKinerja = 3.0;
        } else {
            this.ratingKinerja = ratingKinerja;
        }
    }

    // Fungsi buat ngitung gaji total
    public double hitungGajiTotal() {
        int masaKerja = 2026 - tahunMasuk; // Asumsi tahun sekarang 2026
        // Bonus loyalitas: 5% per tahun dari gaji pokok
        double bonusLoyalitas = (0.05 * gajiPokok) * masaKerja;
        double totalSementara = gajiPokok + bonusLoyalitas;

        // Kalo kerjaannya kurang oke (rating < 2.5), kena potong 10%
        if (ratingKinerja < 2.5) {
            totalSementara *= 0.9;
        }
        return totalSementara;
    }

    public void displayInfo() {
        System.out.println("ID: " + idKaryawan);
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Rating: " + ratingKinerja);
        System.out.println("Gaji Pokok: Rp" + gajiPokok);
    }

    // Getter & Setter seperlunya (dibutuhkan subclass untuk hitung gaji)
    public double getGajiPokok() { return gajiPokok; }
    public double getRatingKinerja() { return ratingKinerja; }
    public String getNama() { return nama; }
}