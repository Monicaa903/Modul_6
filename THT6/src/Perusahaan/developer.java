package perusahaan;

public class Developer extends Karyawan {
    private String level; // Junior, Mid, Senior
    private int jumlahBugFix;

    public Developer(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja, String level, int jumlahBugFix) {
        // Panggil konstruktor bapaknya dulu (Karyawan)
        super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja);
        this.level = level;
        this.jumlahBugFix = jumlahBugFix;
    }

    @Override
    public double hitungGajiTotal() {
        // Ambil gaji dasar dari perhitungan bapaknya
        double gajiBase = super.hitungGajiTotal();
        double bonusBug = 0;

        // Bonus bug cuma cair kalo rating minimal 3.0
        if (getRatingKinerja() >= 3.0) {
            // Itungannya: 50rb per bug, tapi mentok di 1jt
            bonusBug = jumlahBugFix * 50000;
            if (bonusBug > 1000000) {
                bonusBug = 1000000;
            }
        }
        return gajiBase + bonusBug;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Developer (" + level + ")");
        System.out.println("Bug Fixed: " + jumlahBugFix);
    }
}