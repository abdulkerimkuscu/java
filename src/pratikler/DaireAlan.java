package pratikler;

import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = 3.14, r, a, dilimAlani;

        System.out.print("Dairenin Yarıçapını Giriniz: ");

        r = input.nextDouble();

        System.out.print("Açıyı Giriniz: ");

        a = input.nextDouble();

        dilimAlani = (pi * (r*r) * a)/360;

        System.out.println("Daire Diliminin Alanı: " + dilimAlani);

    }
}
