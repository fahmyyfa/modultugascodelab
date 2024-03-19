import java.util.Scanner;

public class Tabung extends BangunRuang{
    Scanner scanner = new Scanner(System.in);
    private double tinggi;
    private double jariJari;

    Tabung() {

    }

    Tabung(String nameBangun) {
        super(nameBangun);
    }

    @Override
    public void inputNilai() {
        super.inputNilai();
        System.out.print("Masukkan tinggi tabung: ");
        tinggi = scanner.nextDouble();
        System.out.print("Masukkan jari-jari tabung: ");
        jariJari = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan() {
        double luas = 2 * Math.PI * jariJari * (jariJari + tinggi);
        super.luasPermukaan();
        System.out.println("Luas permukaan tabung: " + luas);
    }

    public void volume() {
        double hasil = Math.PI * Math.pow(jariJari, 2) * tinggi;
        super.volume();
        System.out.println("Volume tabung: " + hasil);
    }
}
