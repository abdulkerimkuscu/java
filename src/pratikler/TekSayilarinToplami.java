package pratikler;

import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {
        int num, sum= 0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Sayıyı Giriniz: ");
            num = input.nextInt();
            if(num % 4 == 0){
                sum+= num;
            }else if (num % 2 != 0) {
                System.out.println("Tek Sayı Girdiniz!");
            }
        }while (num % 2 == 0);
        System.out.println("Girilen Sayıların 2 ve 4\'e Bölünebilen Sayıların Toplamı: " + sum);
    }
}
