package odevler;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 1, total;
        System.out.print("Fibonacci Serisi İçin Sayı Giriniz: ");
        int number = input.nextInt();
        System.out.println(number + "sayısının fibonacci değeri");
        for (int i = 1; i<=number; i++){
            System.out.print(num1 + " ");
            total = num1 + num2;

            num1 = num2;
            num2 = total;
        }
    }
}
