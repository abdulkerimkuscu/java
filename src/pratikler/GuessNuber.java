package pratikler;


import java.util.Arrays;
import java.util.Scanner;

public class GuessNuber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = (int) (Math.random() * 100);
        System.out.println(number);
        int right = 0;

        int selected;

        int[] wrong = new int[5];

        boolean isWrong = false;
        boolean isWin = false;
        while (right < 3) {
            System.out.print("Bir Sayı Giriniz: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Hatalı Sayı Girdiniz: ");
                if (isWrong) {
                    right++;
                    System.out.println("Çok Fazla Hatalı Giriş Yaptınız. Kalan Hak: " + (5 - right));

                } else {
                    isWrong = true;
                    System.out.println("Bir Hatalı Girişinizde Hakkınızdan Düşülecektir.");
                }
                continue;
            }
            if (selected == number) {
                System.out.println("Tebrikler Kazandınız");
                isWin = true;
                break;
            } else {
                if (selected > number) {
                    System.out.println(selected + " Gizli Sayıdan Büyük");
                }else {
                    System.out.println(selected + " Gizli Sayıdan Küçük");
                }
                wrong[right++]= selected;
                System.out.println("Kalan Hakkınız: " + (5- right));
            }

        }
        if (!isWin){
            System.out.println("Kaybettiniz");
            if(!isWrong){
                System.out.println("Tahmileriniz: " + Arrays.toString(wrong));
        }
        }


    }

}
