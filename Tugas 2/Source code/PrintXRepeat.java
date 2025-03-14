import java.util.Scanner;

public class PrintXRepeat {
    public static void main(String[] args) {
        /* Kamus */
        int sum = 0;
        int x;
        Scanner masukan = new Scanner(System.in);

        /* Program */
        System.out.print("Masukkan nilai x (int), akhiri dengan 999: ");
        x = masukan.nextInt(); // Membaca input pertama

        if (x == 999) {
            System.out.println("Kasus kosong");
        } else {
            do {
                sum += x; // Menambahkan nilai x ke sum
                System.out.print("Masukkan nilai x (int), akhiri dengan 999: ");
                x = masukan.nextInt(); // Membaca input berikutnya
            } while (x != 999); // Berhenti jika input adalah 999
            
            System.out.println("Hasil penjumlahan = " + sum);
        }
    }
}