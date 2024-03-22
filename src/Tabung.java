import java.util.Scanner;
import java.text.DecimalFormat;
public class Tabung extends BRuangKBT {
    Scanner scanner = new Scanner(System.in);
    private double jari_jari;
    private double tinggi;

    Tabung(String name) {
        super(name);
    }

    @Override
    public void inputNilai() {
        super.luasPermukaan();
        System.out.print("Masukan Tinggi Tabung (cm)    : ");
        tinggi = scanner.nextDouble();
        System.out.print("Masukan r Tabung (cm)         : ");
        jari_jari = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan() {
        double hasil = 2 * Math.PI * jari_jari * (jari_jari);

        // Digunakan untuk format 1 angka dibelakang koma
        DecimalFormat df = new DecimalFormat("#.#");
        String hasilFormatted = df.format(hasil);
        super.luasPermukaan();
        System.out.println("Hasil Luas Permukaan  (cm^2): " + hasilFormatted);
    }

}



