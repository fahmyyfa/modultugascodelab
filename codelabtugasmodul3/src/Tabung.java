import java.util.Scanner;

class Tabung extends BangunRuang{
    double jariJari;
    double tinggi;

    public Tabung() {
        super();
    }

    @Override
    public void inputNilai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari-jari tabung: ");
        jariJari = scanner.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        tinggi = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan() {
        double luas = 2 * Math.PI * jariJari * (jariJari + tinggi);
        System.out.println("Luas permukaan tabung: " + luas);
    }

    public void volume() {
        double volume = Math.PI * Math.pow(jariJari, 2) * tinggi;
        System.out.println("Volume tabung: " + volume);
    }
}
