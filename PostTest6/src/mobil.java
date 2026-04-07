class Mobil extends Kendaraan {
    int kapasitasPenumpang;

    Mobil(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar, int kapasitasPenumpang) {
        super(nomorPolisi, merk, tahunProduksi, hargaSewaDasar);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas Penumpang: " + kapasitasPenumpang + " orang");
    }

    @Override
    double hitungHargaSewa(int hari) {
        double totalBase = super.hitungHargaSewa(hari);
        double biayaAsuransi = 50000 * hari;
        double biayaKebersihan = 0;

        if (kapasitasPenumpang > 5) {
            biayaKebersihan = 50000;
        }

        return totalBase + biayaAsuransi + biayaKebersihan;
    }
}