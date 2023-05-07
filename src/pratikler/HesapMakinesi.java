package pratikler;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double n1, n2, sonuc ;
        int islem;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz: ");

        n1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");

        n2 = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme");
        System.out.print("İşlemi Seçiniz: ");
        islem = input.nextInt();

        switch (islem) {
            case 1:
                sonuc = (n1 + n2);
                System.out.println("Sonuç: " +  sonuc);
                System.out.println("İşlem Tamamlandı!");
                break;
            case 2:
                sonuc = (n1 - n2);
                System.out.println("Sonuç: " +  sonuc);
                System.out.println("İşlem Tamamlandı!");
                break;
            case 3:
                sonuc = (n1*n2);
                System.out.println("Sonuç: " +  sonuc);
                System.out.println("İşlem Tamamlandı!");
                break;
            case 4:
                if(n2 != 0) {
                    sonuc = (n1 / n2);
                    System.out.println("Sonuç: " + sonuc );
                    System.out.println("İşlem Tamamlandı!");
                }
                else {
                    System.out.println("Sayı Sıfıra Bölünemez!!");
                }
                break;
            default:
                System.out.println("Olmayan Bir İşlem Seçtiniz");
        }
    }
}
