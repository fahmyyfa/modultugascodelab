import java.util.Scanner;

public class Balok extends BangunRuang{
    Scanner scanner = new Scanner(System.in);
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok() {
    }

    Balok(String nameBangun) {
        super(nameBangun);
    }

    @Override
    public void inputNilai() {
        super.inputNilai();
        System.out.println("Masukkan panjang balok: ");
        panjang = scanner.nextDouble();
        System.out.println("Masukkan lebar balok: ");
        lebar = scanner.nextDouble();
        System.out.println("Masukkan tinggi balok: ");
        tinggi = scanner.nextDouble();
    }

    public void luasPermukaan() {
        double luasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        super.luasPermukaan();
        System.out.println("Luas Permukaan Balok: " + luasPermukaan);
    }

    public void volume() {
        double volume = panjang * lebar * tinggi;
        super.volume();
        System.out.println("Volume Balok: " + volume);
    }
}
