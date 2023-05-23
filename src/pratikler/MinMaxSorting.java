package pratikler;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Giriniz: ");
        int n = input.nextInt();
        int[] list = new int[n];
        System.out.print("Dizinin Elemanlarını Giriniz: ");
        for (int i = 0; i < n; i++) {
            list[i] = input.nextInt();
        }

        System.out.print("Bir Sayı Giriniz: ");
        int number = input.nextInt();
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        Arrays.sort(list);

        for (int item : list) {
            if (item > number) {
                max = item;
                break;
            }

        }
        for (int i = list.length-1;i>=0; i--) {
            if (list[i] < number) {
                min = list[i];
                break;
            }
        }
        System.out.println(Arrays.toString(list));
        System.out.println("En yakın büyük sayı :" + max);
        System.out.println("En yakın küçük sayı :" + min);

    }
}
