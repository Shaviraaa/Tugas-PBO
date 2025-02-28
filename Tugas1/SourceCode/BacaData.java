import java.util.Scanner;

public class BacaData {
    public static void main(String[] args) {
        // Deklarasi Scanner
        Scanner masukan = new Scanner(System.in);

        // Menampilkan pesan ke pengguna
        System.out.print("Contoh membaca dan menulis, ketik nilai integer: ");

        // Membaca input dari pengguna
        int a = masukan.nextInt();

        // Menampilkan output
        System.out.println("Nilai yang dibaca: " + a);

        // Menutup Scanner
        masukan.close();
    }
}
