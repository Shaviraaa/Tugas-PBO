import java.util.Scanner;

/* Program untuk menentukan bilangan maksimum dari dua bilangan */
public class Max2 {
    public static void main(String[] args) {
        /* Kamus */
        int a, b;
        Scanner masukan = new Scanner(System.in);

        /* Program */
        System.out.println("Maksimum dua bilangan:");
        System.out.print("Ketikkan dua bilangan, pisahkan dengan ENTER: ");

        a = masukan.nextInt();
        b = masukan.nextInt();
        
        System.out.println("Ke dua bilangan: a = " + a + " b = " + b);
        
        if (a >= b) {
            System.out.println("Nilai maksimum: " + a);
        } else { // a < b
            System.out.println("Nilai maksimum: " + b);
        }

        // Menutup Scanner untuk menghindari kebocoran sumber daya
        masukan.close();
    }
}