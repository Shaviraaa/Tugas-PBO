import java.util.Scanner;
/* Contoh program yang mengandung prosedur dan fungsi */
public class SubProgram {

    /* Fungsi untuk mencari maksimum dari dua bilangan bulat */
    public static int maxab(int a, int b) {
        return (a >= b) ? a : b;
    }

    /* Prosedur untuk menukar dua bilangan bulat (menggunakan array sebagai referensi) */
    public static void tukar(int[] ab) {
        int temp = ab[0];
        ab[0] = ab[1];
        ab[1] = temp;
        System.out.println("Ke dua bilangan setelah tukar: a = " + ab[0] + " b = " + ab[1]);
    }

    /* Program Utama */
    public static void main(String[] args) {
        int a, b;
        Scanner masukan = new Scanner(System.in);

        System.out.println("Maksimum dua bilangan");
        System.out.print("Ketikkan dua bilangan, pisahkan dengan ENTER: ");
        a = masukan.nextInt();
        b = masukan.nextInt();

        System.out.println("Ke dua bilangan sebelum tukar: a = " + a + " b = " + b);
        System.out.println("Maksimum = " + maxab(a, b));

        System.out.println("Menukar kedua bilangan...");
        int[] ab = {a, b}; // Gunakan array agar perubahan bisa dipertahankan
        tukar(ab);

        masukan.close(); // Tutup scanner untuk mencegah kebocoran sumber daya
    }
}