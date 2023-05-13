package odevler;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        int year = input.nextInt();

        //Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır
        //Ancak 100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır
        //Bu yüzden yılın 4 e bölümünden kalan 0 olmalı veya 400 e bölümünden kalan 0 olmalı
        /*Ancak 4 e ve 100 e bölünüp 400 e bölünememesi için 100 e bölmünden kalanın 0 a eşit olmaması gerek
        Bu sebebple ilk koşul sağlanamadığı için false dönmeli ki hatalı sonuç almamalıyız.
        Biraz karışık gibi gözüksede kodları incelerseniz dediğim anlaşılır :)))))
        Kodu inceleyip kafanızdan denerseniz çalışma mantığını anlayabilirsiniz.
         */

        if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)){
            System.out.println(year +" Artık Yıldır");
        }else {
            System.out.println(year + " Artık Yıl Değildir");
        }
    }
}
