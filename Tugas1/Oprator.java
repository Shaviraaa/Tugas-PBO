/* Contoh pengoperasian variabel bertipe dasar */
public class Oprator {
    public static void main(String[] args) {
        /* Kamus */
        boolean Bool1, Bool2, TF;
        int i, j, hsl;
        float x, y, res;

        /* Algoritma */
        System.out.println("=== Operasi Boolean ===");
        Bool1 = true;
        Bool2 = false;

        TF = Bool1 && Bool2; /* Boolean AND */
        System.out.println("Bool1 AND Bool2: " + TF);

        TF = Bool1 || Bool2; /* Boolean OR */
        System.out.println("Bool1 OR Bool2: " + TF);

        TF = !Bool1; /* NOT */
        System.out.println("NOT Bool1: " + TF);

        TF = Bool1 ^ Bool2; /* XOR */
        System.out.println("Bool1 XOR Bool2: " + TF);

        System.out.println("\n=== Operasi Numerik ===");
        i = 5;
        j = 2;

        hsl = i + j;
        System.out.println("i + j = " + hsl);

        hsl = i - j;
        System.out.println("i - j = " + hsl);

        hsl = i * j;
        System.out.println("i * j = " + hsl);

        hsl = i / j; /* Pembagian bulat */
        System.out.println("i / j = " + hsl);

        hsl = i % j; /* Modulo */
        System.out.println("i % j = " + hsl);

        System.out.println("\n=== Operasi Numerik dengan Float ===");
        x = 5;
        y = 5;

        res = x + y;
        System.out.println("x + y = " + res);

        res = x - y;
        System.out.println("x - y = " + res);

        res = x * y;
        System.out.println("x * y = " + res);

        res = x / y;
        System.out.println("x / y = " + res);

        System.out.println("\n=== Operasi Relasional ===");
        System.out.println("i == j: " + (i == j));
        System.out.println("i != j: " + (i != j));
        System.out.println("i < j: " + (i < j));
        System.out.println("i > j: " + (i > j));
        System.out.println("i <= j: " + (i <= j));
        System.out.println("i >= j: " + (i >= j));

        System.out.println("\n=== Operasi Relasional dengan Float ===");
        System.out.println("x != y: " + (x != y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x <= y: " + (x <= y));
        System.out.println("x >= y: " + (x >= y));
    }
}
