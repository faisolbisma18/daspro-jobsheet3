import java.util.Scanner;


public class siakad10 {
    
    public static void main(String[]args) {

    Scanner sc = new Scanner(System.in);

    String nama, nim;
    char kelas;
    byte absen;
    double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

    System.out.print("Masukkan nama: ");
    nama = sc.nextLine();
    System.out.print("masukkan NIM: ");
    nim = sc.nextLine();
    System.out.print("masukkan kelas: ");
    kelas = sc.nextLine().charAt(0);
    System.out.print("masukkan nomor absen: ");
    absen = sc.nextByte();

    System.out.print("masukkan nilai kuis: ");
    nilaiKuis = sc.nextDouble();
    System.out.print("masukkan nilai tugas: ");
    nilaiTugas = sc.nextDouble();
    System.out.print("masukkan nilai ujian: ");
    nilaiUjian = sc.nextDouble();

    nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

    System.out.println("Nama: " + nama + " NIM " + nim);
    System.out.println("Kelas: " + kelas + "Absen" + absen);
    System.out.println("Nilai Akhir: " + nilaiAkhir);

}
}
