class Kendaraan {
    String nomorPolisi;
    String merk;
    int tahunProduksi;
    double hargaSewaDasar;

    Kendaraan(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar) {
        this.nomorPolisi = nomorPolisi;
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.hargaSewaDasar = hargaSewaDasar;
    }

    void displayInfo() {
        System.out.println("No. Polisi: " + nomorPolisi);
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahunProduksi);
    }

    double hitungHargaSewa(int hari) {
        double total = hargaSewaDasar * hari;
        if (tahunProduksi < 2015) {
            total = total * 0.9;
        }
        return total;
    }
}