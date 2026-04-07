class Motor extends Kendaraan {
    int kapasitasMesin;

    Motor(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar, int kapasitasMesin) {
        super(nomorPolisi, merk, tahunProduksi, hargaSewaDasar);
        this.kapasitasMesin = kapasitasMesin;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas Mesin: " + kapasitasMesin + " CC");
    }

    @Override
    double hitungHargaSewa(int hari) {
        double totalBase = super.hitungHargaSewa(hari);
        double pajakMewah = 0;

        if (kapasitasMesin >= 250) {
            pajakMewah = 25000 * hari;
        }

        return totalBase + pajakMewah;
    }
}