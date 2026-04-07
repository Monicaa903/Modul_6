class produk {
    String namaP;
    double harga;

    public produk(String namaP, double harga) {
        this.namaP = namaP;
        this.harga = harga;
    }

    public void tampil() {
        System.out.println("Nama: " + namaP);
        System.out.println("Harga: " + harga);
    }
}

public class MakRing extends produk {
    String rasa;

    public MakRing(String rasa, String namaP, double harga) {
        super(namaP, harga);
        this.rasa = rasa;
    }

    @Override
    public void tampil() {
        super.tampil();
        System.out.println(rasa);
    }
}