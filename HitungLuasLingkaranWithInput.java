import java.util.Scanner;

public class HitungLuasLingkaranWithInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Jari-Jari Lingkaran:");
        double jariJari = scanner.nextDouble();

        double luas = Math.PI * jariJari * jariJari;
        System.out.println("Luas Lingkaran dengan Jari Jari " + jariJari + " Adalah: " + luas);

        scanner.close();

    }
}