import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswi {
    public Scanner scanner;

    public String nama;
    public String fakultas;
    public String programStudi;
    public String nim;

    public ArrayList<Buku> daftarBuku = new ArrayList<>();

    public Mahasiswi(Scanner scanner) {
        this.scanner = scanner;

        Buku buku1 = new Buku("001", "Java Programming", "fahmi", 10);
        Buku buku2 = new Buku("002", "Data Structures and Algorithms", "fadhil", 5);
        Buku buku3 = new Buku("003", "Introduction to Artificial Intelligence", "fakhri", 8);

        daftarBuku.add(buku1);
        daftarBuku.add(buku2);
        daftarBuku.add(buku3);
    }

    public String getNim() {
        return nim;
    }

    public void tampilkanDaftarBuku() {
        System.out.println("Daftar Buku:");
        for (Buku buku : daftarBuku) {
            System.out.println("ID: " + buku.getId());
            System.out.println("Judul: " + buku.getJudul());
            System.out.println("Pencipta: " + buku.getPencipta());
            System.out.println("Stok: " + buku.getStok());
            System.out.println();
        }
    }

    public void pinjamBuku() {
        System.out.println("Masukkan ID Buku yang ingin dipinjam: ");
        String idBuku = scanner.nextLine();

        // Cari buku berdasarkan ID
        Buku bukuDipinjam = null;
        for (Buku buku : daftarBuku) {
            if (buku.getId().equals(idBuku)) {
                bukuDipinjam = buku;
                break;
            }
        }

        if (bukuDipinjam != null) {
            if (bukuDipinjam.getStok() > 0) {
                // Kurangi stok buku
                bukuDipinjam.setStok(bukuDipinjam.getStok() - 1);
                System.out.println("Buku berhasil dipinjam.");
            } else {
                System.out.println("Maaf, stok buku tidak mencukupi.");
            }
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
    }

    public void logout() {
        System.out.println("Logout berhasil.");
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getFakultas() {
        return fakultas;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public void menuMahasiswa() {
        int pilihanMahasiswa;
        do {
            System.out.println("Menu Mahasiswa:");
            System.out.println("1. Lihat Daftar Buku");
            System.out.println("2. Pinjam Buku");
            System.out.println("3. Logout");
            System.out.print("Pilihan Anda: ");
            pilihanMahasiswa = scanner.nextInt();
            scanner.nextLine();

            switch (pilihanMahasiswa) {
                case 1:
                    tampilkanDaftarBuku();
                    break;
                case 2:
                    pinjamBuku();
                    break;
                case 3:
                    logout();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihanMahasiswa != 3);
    }
}