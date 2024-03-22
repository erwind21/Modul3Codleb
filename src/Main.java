public class Main {
        public static void main(String[] args) {
            Tabung tabung = new Tabung(" tabung");
            Balok balok = new Balok(" balok");
            Kubus kubus = new Kubus(" kubus");

            tabung.inputNilai();
            tabung.luasPermukaan();
            tabung.volume();

            balok.inputNilai();
            balok.luasPermukaan();
            balok.volume();
            System.out.println("\n");

            kubus.inputNilai();
            kubus.luasPermukaan();
            kubus.volume();
            System.out.println("\n");
        }
    }
