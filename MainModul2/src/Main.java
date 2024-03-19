import java.util.Scanner;

class Mahasiswa {
    static String nama;
    static String nim;
    static String jurusan;

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public static void tampilDataMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
    }

    public static void tambahkanDataMahasiswa(){
        Scanner input = new Scanner(System.in);

        System.out.println("Input Data Mahasiswa");
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("NIM: ");
        String nim = input.nextLine();
        System.out.print("Jurusan: ");
        String jurusan = input.nextLine();

        if (nim.length() != 15) {
            System.out.println("Panjang NIM harus 15 angka.");
            return;
        }

        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan);
    }

    public static void tampilUniversitas() {
        System.out.println("Universitas Muhammadiyah Malang");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Menu: ");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Exit");
            System.out.print("Pilihan Anda: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    Mahasiswa.tambahkanDataMahasiswa();
                    break;
                case 2:
                    Mahasiswa.tampilUniversitas();
                    Mahasiswa.tampilDataMahasiswa();
                    break;
                case 3:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }
}
