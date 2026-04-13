import perusahaan.*; // Import semua kelas dari package perusahaan
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Pakai ArrayList tipe Superclass (Polymorphism)
        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();

        // Masukin 5 objek sesuai skenario THT
        daftarKaryawan.add(new Karyawan("K01", "Budi Biasa", 2020, 5000000, 2.0)); // Kena penalti
        daftarKaryawan.add(new Developer("D01", "Andi Senior", 2018, 10000000, 4.0, "Senior", 25)); // Bonus bug max
        daftarKaryawan.add(new Developer("D02", "Sari Mid", 2024, 7000000, 2.8, "Mid", 15)); // Bonus hangus
        daftarKaryawan.add(new Manajer("M01", "Pak Joko", 2015, 15000000, 4.8, "IT", 10)); // Bonus 15%
        daftarKaryawan.add(new Manajer("M02", "Bu Retno", 2025, 12000000, 3.5, "HR", 3)); // Normal tunjangan

        double totalAnggaran = 0;

        System.out.println("~~~ Laporan Gaji Karyawan 2026 ~~~\n");

        for (Karyawan k : daftarKaryawan) {
            k.displayInfo(); // Java otomatis milih method yang bener (Dynamic Method Dispatch)
            double gaji = k.hitungGajiTotal();
            System.out.println("Total Gaji Bulan Ini: Rp" + String.format("%.2f", gaji));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            totalAnggaran += gaji;
        }

        System.out.println("\nTOTAL ANGGARAN GAJI PERUSAHAAN: Rp" + String.format("%.2f", totalAnggaran));
    }
}