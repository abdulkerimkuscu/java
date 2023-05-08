package pratikler;

import java.util.Scanner;

public class DortveBesinKuvvetleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int num = input.nextInt();

        System.out.println("Dördün Katları: ");
        for (int i = 1; i<=num; i*=4 ){
            System.out.println(i);
        }
        System.out.println("Beşin Katları: ");

        for (int i = 1; i<=num; i*=5 ){
            System.out.println(i);
        }
    }
}
