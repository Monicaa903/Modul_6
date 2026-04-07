class Hero {
    String nama;
    double health;
    double attackPower;

    Hero(String nama, double health, double attackPower) {
        this.nama = nama;
        this.health = health;
        this.attackPower = attackPower;
    }

    void display() {
        System.out.println("Nama: " + nama);
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
    }

    void berlatih() {
        attackPower += 10;
        System.out.println(nama + " sedang berlatih! (Attack Power bertambah menjadi " + attackPower + ")");
    }

    void terimaSerangan(double damage) {
        health -= damage;
        System.out.println(nama + " menerima serangan sebesar " + damage);
    }
}