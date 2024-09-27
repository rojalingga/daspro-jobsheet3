import java.util.Scanner;

public class gajikaryawan20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int jamKerja;
        double upahPerJam, gajiPokok, bonus, totalGajiSebelumPajak, pajak, gajiBersih;

        System.out.print("Masukkan jumlah jam kerja: ");
        jamKerja = input.nextInt() * 28; // dikalikan 28 karena ada ada 28 hari kerja dalam sebulan
        System.out.print("Masukkan upah per jam: ");
        upahPerJam = input.nextDouble();
        gajiPokok = jamKerja * upahPerJam;

        bonus = gajiPokok * 10/100;

        totalGajiSebelumPajak = gajiPokok + bonus;

        pajak = totalGajiSebelumPajak * 5/100;

        gajiBersih = totalGajiSebelumPajak - pajak;

        System.out.println("Gaji bersih: Rp " + gajiBersih);

    }
}