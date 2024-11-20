import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih Opsi:");
        System.out.println("1. Konversi dari Celcius Ke Fahrenheit ");
        System.out.println("2. Konversi dari Fahrenheit Ke Celcius");
        System.out.print("Masukkan Pilihan (1 Atau 2):");

        int choice = scanner.nextInt();

        double temperature;

        switch (choice) {
            case 1:
                System.out.print("Masukkan Suhu Dalam Celcius:");
                temperature = scanner.nextDouble();
                double fahrenheit = celciusToFahrenheit(temperature);
                System.out.println("Suhu Dalam Fahrenheit: " + fahrenheit);
                break;
            case 2:
                System.out.print("Masukkan Suhu Dalam Fahrenheit:");
                temperature = scanner.nextDouble();
                double celcius = fahrenheitToCelcius(temperature);
                System.out.println("Suhu Dalam Celcius: " + celcius);
                break;
            default:
                System.out.println("Pilihan Tidak Valid");
                break;
        }

        scanner.close();
    }

    public static double celciusToFahrenheit(double celcius) {
        return celcius * 9 / 5 + 32;
    }

    public static double fahrenheitToCelcius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
