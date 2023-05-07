package pratikler;

import java.util.Scanner;

public class HavaDurumu {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Sıcaklık Değerini Giriniz: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz!");
        } else if (heat <= 25) {
            if (heat <= 15) {
                System.out.println("Sinemaya gidebilirsiniz!");
            }
            if (heat >= 10) {
                System.out.println("Pikniğe Gidebilirsiniz!");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsiniz!");
        }
    }
}
