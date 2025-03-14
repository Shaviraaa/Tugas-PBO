import java.util.Scanner;
/* Membaca nilai x, */
/* Menjumlahkan nilai yang dibaca dengan WHILE */
public class PrintXWhile {
    public static void main(String[] args) {
        /* Kamus */
        int sum = 0; // Inisialisasi variabel penjumlahan
        int x;
        Scanner masukan = new Scanner(System.in);

        /* Program */
        System.out.print("Masukkan nilai x (int), akhiri dengan 999: ");
        x = masukan.nextInt(); // Membaca elemen pertama

        while (x != 999) { // Perulangan berjalan hingga x = 999
            sum += x; // Proses penjumlahan
            System.out.print("Masukkan nilai x (int), akhiri dengan 999: ");
            x = masukan.nextInt(); // Membaca elemen berikutnya
        }

        System.out.println("Hasil penjumlahan = " + sum); // Output hasil
        masukan.close(); // Menutup scanner untuk mencegah kebocoran sumber daya
    }
}