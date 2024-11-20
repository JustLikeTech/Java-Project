import java.util.Scanner;

public class ClockConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jam: ");
        int jam = input.nextInt();

        System.out.print("Masukkan menit: ");
        int menit = input.nextInt();

        System.out.print("Masukkan detik: ");
        int detik = input.nextInt();

        int totalDetik = (jam * 3600) + (menit * 60) + detik;
        System.out.println("Total detik: " + totalDetik);
    }
}
