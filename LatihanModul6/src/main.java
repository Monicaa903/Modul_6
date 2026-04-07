class Main {
   static void main(String[] args) {
        Hero hero1 = new Hero("Alucard", 100, 20);
        HeroStrength hero2 = new HeroStrength("Gatotkaca", 200, 15);

        System.out.println("~~~ Status AWal ~~~");
        hero1.display();
        System.out.println("~~~~~~~~~~~~~~~~");
        hero2.display();

        System.out.println("\n~~~ Sesi Latihan ~~~~");
        hero1.berlatih();
        hero2.berlatih();

        System.out.println("\n~~~ Simulasi Terkena Damage (50) ~~~");
        hero1.terimaSerangan(50);
        hero2.terimaSerangan(50);

        System.out.println("\n~~~~ Status Akhir ~~~~");
        hero1.display();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        hero2.display();
    }
}