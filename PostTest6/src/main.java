import java.util.ArrayList;

class Main {
 static void main(String[] args) {
        ArrayList<Kendaraan> daftarSewa = new ArrayList<>();

        daftarSewa.add(new Mobil("B 1234 ABC", "Toyota Avanza", 2012, 300000, 7));
        daftarSewa.add(new Mobil("D 5678 DEF", "Honda City", 2020, 500000, 5));
        daftarSewa.add(new Motor("F 9101 GHI", "Kawasaki Ninja", 2022, 200000, 250));
        daftarSewa.add(new Motor("B 1122 JKL", "Honda Vario", 2018, 100000, 150));

        System.out.println("~~~ Sistem Rwntal Kendaraan ~~~~");
        for (Kendaraan k : daftarSewa) {
            k.displayInfo();
            System.out.println("Total Biaya Sewa selama 5 Hari: Rp" + k.hitungHargaSewa(5));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~```");
        }
    }
}