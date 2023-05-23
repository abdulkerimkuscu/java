package pratikler;

import java.util.Arrays;
import java.util.Scanner;

public class AvarageArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Giriniz: ");

        int n = input.nextInt();
        int[] list = new int[n];

        System.out.print("Dizinin Elemanlarını Giriniz: ");

        for(int i = 0; i<n; i++){
            list[i] = input.nextInt();
        }
        double sum = 1;

        for (int i =0 ; i<list.length;i++ ){
            sum += 1/list[i];
        }
        System.out.println(Arrays.toString(list) + "Dizisinin");
        System.out.println("Harmonik Ortalaması: " + list.length/sum);
    }
}
