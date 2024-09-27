import java.util.Scanner;

public class tagihanlistrik20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double penggunaanListrik, totalTagihan;
        double tarifPerKwh = 1500;
        
        System.out.print("Masukkan penggunaan listrik (kWh): ");
        penggunaanListrik = input.nextDouble();

        totalTagihan = penggunaanListrik * tarifPerKwh;

        if (penggunaanListrik > 500) {
            System.out.println("Penggunaan listrik melebihi 500 kWh.");
        }

        System.out.println("Total tagihan: Rp " + totalTagihan);
    }
}
