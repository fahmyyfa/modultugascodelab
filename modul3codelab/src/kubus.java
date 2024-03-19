import java.util.Scanner;
class Kubus extends BangunRuang {
    double sisi;

    public Kubus() {

    }

    @Override
    public void inputNilai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus: ");
        sisi = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan() {
        double luas = 6 * Math.pow(sisi, 2);
        System.out.println("Luas permukaan kubus: " + luas);
    }

    @Override
    public void volume() {
        double volume = Math.pow(sisi, 3);
        System.out.println("Volume kubus: " + volume);
    }
}