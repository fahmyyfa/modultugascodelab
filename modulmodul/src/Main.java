import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class codelab {
    public static void main (String[] args){

        String nama;
        String jenisKelamin;
        String tanggalLahir;
        Scanner ObjInput = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        nama = ObjInput.nextLine();
        System.out.print("Masukkan Jenis Kelamin (L/P): ");
        jenisKelamin = ObjInput.nextLine();
        System.out.print("Masukkan Tanggal Lahir (yyyy-mm-dd): ");
        tanggalLahir = ObjInput.nextLine();

        System.out.println("Nama anda : " + nama);

        if (jenisKelamin.equalsIgnoreCase("L")){
            System.out.println("Jenis Kelamin anda : Laki-Laki");
        } else if (jenisKelamin.equalsIgnoreCase("P")){
            System.out.println("Jenis Kelamin anda : Perempuan");
        } else {
            System.out.println("Jenis Kelamin anda : Tidak valid");
        }

        LocalDate lahir = LocalDate.parse(tanggalLahir);
        LocalDate sekarang = LocalDate.now();
        Period umur = Period.between(lahir,sekarang);

        System.out.println("Umur anda : " + umur.getYears() + "Tahun" + umur.getMonths() + "Bulan" + umur.getDays() + "Hari");
    }
}