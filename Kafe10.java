import java.util.Scanner;

public class Kafe10 {
    
    public static void main(String[]args) {

    Scanner input = new Scanner(System.in);

    boolean keanggotaan;
    int jmlkopi, jmlteh, jmlroti;
    double hargakopi = 12000.0, hargateh = 7000.0, hargaroti = 20000.0, totalHarga, nominalBayar;
    float diskon = 10 / 100f;   
    

    System.out.print("Masukkan Keanggotaan (true/false): ");
    keanggotaan = input.nextBoolean();
    System.out.print("Masukkan jumlah pembelian kopi: ");
    jmlkopi = input.nextInt();
    System.out.print("Masukkan jumlah pembelian teh: ");
    jmlteh = input.nextInt();
    System.out.print("Masukkan jumlah pembelian roti: ");
    jmlroti = input.nextInt();

    totalHarga = (jmlkopi * hargakopi) + (jmlteh * hargateh) + (jmlroti * hargaroti);
    nominalBayar = totalHarga - (diskon * totalHarga);

    System.out.println("Keanggotaan pelanggan " + keanggotaan);
    System.out.println("Item pembelian" + jmlkopi + "kopi," + jmlteh + "teh," + jmlroti + "roti");
    System.out.println("Nominal bayar Rp" + nominalBayar);

    }
}