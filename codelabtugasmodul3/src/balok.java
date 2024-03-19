import java.util.Scanner;

class Balok {
    double panjang;
    double lebar;
    double tinggi;

    public void inputNilai() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang balok: ");
        panjang = input.nextDouble();
        System.out.println("Masukkan lebar balok: ");
        lebar = input.nextDouble();
        System.out.println("Masukkan tinggi balok: ");
        tinggi = input.nextDouble();
    }

    public void luasPermukaan() {
        double luasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        System.out.println("Luas Permukaan Balok: " + luasPermukaan);
    }

    public void volume() {
        double volume = panjang * lebar * tinggi;
        System.out.println("Volume Balok: " + volume);
    }
}
