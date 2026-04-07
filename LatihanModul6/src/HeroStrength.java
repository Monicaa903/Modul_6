class HeroStrength extends Hero {
    String tipe = "Strength";

    HeroStrength(String nama, double health, double attackPower) {
        super(nama, health, attackPower);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Tipe: " + tipe);
    }

    @Override
    void terimaSerangan(double damage) {
        double damageDiterima = damage * 0.5;
        health -= damageDiterima;
        System.out.println(nama + " (Strength) memiliki pertahanan kuat! Hanya menerima damage: " + damageDiterima);
    }
}