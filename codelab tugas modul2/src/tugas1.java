import java.util.Scanner;

class Tugas1{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("Pilih jenis pengguna:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    Admin admin = new Admin(scanner);
                    admin.menuAdmin();
                    break;
                case 2:
                    Mahasiswi mahasiswa = new Mahasiswi(scanner);
                    mahasiswa.menuMahasiswa();
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 3);

        scanner.close();
    }
}

class Buku {
    public String id;
    public String judul;
    public String pencipta;
    public int stok;

    public Buku(String id, String judul, String pencipta, int stok) {
        this.id = id;
        this.judul = judul;
        this.pencipta = pencipta;
        this.stok = stok;
    }

    public String getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public String getPencipta() {
        return pencipta;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}