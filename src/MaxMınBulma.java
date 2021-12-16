import java.util.Scanner;

public class MaxMınBulma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int counter = scanner.nextInt();
        int maks = 0;
        int min = 0;


        for (int i = 1; i <= counter; i++) {
            System.out.println(i + ". sayiyi giriniz: ");
            int sayi = scanner.nextInt();

            if (i == 1) {
                maks = sayi;
                min = sayi;
            }

            if (sayi > maks)
                maks = sayi;

            if (sayi < min)
                min = sayi;
        }

        System.out.print("En buyuk sayi: " + maks);
        System.out.print("En kucuk sayi: " + min);
    }
}


