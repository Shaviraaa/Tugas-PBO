import java.util.Scanner;

public class PrintXinterasi {
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
            sum = x; // Inisialisasi jumlah dengan nilai pertama
            while (true) {
                System.out.print("Masukkan nilai x (int), akhiri dengan 999: ");
                x = masukan.nextInt(); // Membaca input berikutnya
                
                if (x == 999) {
                    break; // Keluar dari loop jika pengguna memasukkan 999
                }
                sum += x; // Menambahkan nilai ke jumlah total
            }
            System.out.println("Hasil penjumlahan = " + sum);
        }
    }
}