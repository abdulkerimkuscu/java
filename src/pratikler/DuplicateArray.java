package pratikler;

import java.util.Scanner;

public class DuplicateArray {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Girin: ");
        int n = input.nextInt();
        int[] list = new int[n];
        System.out.print("Dizinin Elemanlarını Giriniz: ");
        for (int i = 0; i < n; i++) {
            list[i] = input.nextInt();
        }
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }

        }
        System.out.println("Dizide Tekrar Eden Çift Sayılar: ");
        for (int value : duplicate) {
            if (value != 0) {

                System.out.print( value + " ");
            }

        }

    }
}

