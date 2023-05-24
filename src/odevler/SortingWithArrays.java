package odevler;

import java.util.Arrays;
import java.util.Scanner;

public class SortingWithArrays {
    public static void main(String[] args) {
        //Diziyi Oluşturma
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Girin: ");
        int n = input.nextInt();
        int[] list = new int[n];
        System.out.print("Dizinin Elemanlarını Giriniz: ");

        //Dizinin içine elemanları yazdırmak için kullanılan for döngüsü
        for (int i = 0; i < n; i++) {
            list[i] = input.nextInt();
        }
        System.out.println("Dizi: " + Arrays.toString(list));
        //Diziyi sıralamak için array fonksiyonu
        Arrays.sort(list);
        System.out.println("Küçükten Büyüğe Doğru Sıralanmış Dizi: " + Arrays.toString(list));

        // *****İkinci Yol*****

        int temp;
        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < i; j++) {
                if (list[j] > list[i]) {
                    temp = list[i];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }
        System.out.print("Küçükten Büyüğe Doğru Sıralanmış Dizi: "+ Arrays.toString(list) );


    }
}
