package pratikler;

import java.util.Scanner;

public class UcveDorteTamBolunenOrtalama {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz: ");

        num = input.nextInt();
        int sum = 0, count = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }
        double avarage = sum / count;
        System.out.println("3 ve 4\'e bölünen sayıların ortalaması: " + avarage);
    }
}
