package odevler;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayFrequency {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Girin: ");
        int n = input.nextInt();
        int[] list = new int[n];
        System.out.print("Dizinin Elemanlarını Giriniz: ");
        for (int i = 0; i < n; i++) {
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Girilen Listenin Sıralanmış Hali: " + Arrays.toString(list));
        int count = 1;
        for (int i = 0; i < list.length; i++) {
            if (i == 0) {
                for (int j = 0; j < list.length; j++) {
                    if (i != j && list[i] == list[j]) {
                        count++;
                    }
                }
                System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
            } else if (list[i] != list[i - 1]) {
                for (int j = 0; j < list.length; j++) {
                    if (i != j && list[i] == list[j]) {
                        count++;
                    }
                }
                System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
            }
            count = 1;
        }

    }


}

