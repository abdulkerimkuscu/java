package pratikler;

import java.util.Scanner;

public class BasamakToplamı {
    public static void main(String[] args) {
        int number, value, result = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        number = input.nextInt();

        while (number != 0) {
            value = number % 10;
            result += value;
            number /= 10;

        }
        System.out.println("Girdiğiniz Sayının Basamak Değerleri Toplamı: " + result);
    }
}
