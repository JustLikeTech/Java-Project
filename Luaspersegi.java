import java.util.Scanner;

public class Luaspersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Panjang Persegi Panjang: ");
        float panjang = input.nextFloat();

        System.out.print("Masukkan Lebar Persegi: ");
        float lebar = input.nextFloat();

        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang Adalah: " + luas);
    }
}
