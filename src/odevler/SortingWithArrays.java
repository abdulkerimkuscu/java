package odevler;

import java.util.Arrays;
import java.util.Scanner;

public class SortingWithArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Girin: ");
        int n = input.nextInt();
        int[] list = new int[n];
        System.out.print("Dizinin Elemanlarını Giriniz: ");
        for (int i = 0; i < n; i++) {
            list[i] = input.nextInt();
        }
        System.out.println("Dizi: " + Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("Küçükten Büyüğe Doğru Sıralanmış Dizi: " + Arrays.toString(list));
    }
}
