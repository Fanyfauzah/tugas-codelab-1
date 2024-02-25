import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        int age;
        String firstName,Jeniskelamin;
        Scanner objInput = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda : ");
        firstName = objInput.nextLine();
        System.out.print("Masukkan Umur Anda : ");
        age = objInput.nextInt();
        System.out.print("Masukkan jenis kelamin (P/L): ");
        String jenisKelamin = input.nextLine();


        System.out.println("Nama : " + firstName);
        System.out.println("Umur : " + age);
        System.out.print("Masukkan jenis kelamin (P/L): ");

        if (jenisKelamin.equalsIgnoreCase("P")) {
            jenisKelamin = "Perempuan";
        } else if (jenisKelamin.equalsIgnoreCase("L")) {
            jenisKelamin = "Laki-laki";
        } else {
            jenisKelamin = "Tidak diketahui";
        }
        System.out.print("Masukkan tanggal lahir (yyyy-mm-dd): ");
        String tanggalLahirString = input.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirString);

        LocalDate sekarang = LocalDate.now();
        Period umur = Period.between(tanggalLahir, sekarang);

        System.out.println("\nData Diri");
        System.out.println("Nama: " + firstName);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Umur: " + umur.getYears() + " tahun " + umur.getMonths() + " bulan " + umur.getDays() + " hari");

    }
}






