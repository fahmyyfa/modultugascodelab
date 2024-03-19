import java.util.Scanner;
class Kubus extends BangunRuang {
    Scanner scanner = new Scanner(System.in);
    private double sisi;

    public Kubus() {

    }

    @Override
    public void inputNilai() {
        super.inputNilai();
        System.out.print("Masukkan panjang sisi kubus: ");
        sisi = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan() {
        double hasil = 6 * Math.pow(sisi, 2);
        super.luasPermukaan();
        System.out.println("Luas permukaan kubus: " + hasil);
    }

    @Override
    public void volume() {
        double volume = Math.pow(sisi, 3);
        super.volume();
        System.out.println("Volume kubus: " + volume);
    }
}