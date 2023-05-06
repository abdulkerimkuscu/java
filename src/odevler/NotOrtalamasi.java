package odevler;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, turkce, fizik, kimya, muzik;

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();
        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();
        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();
        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();
        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        int toplam = (mat + turkce + fizik + kimya + muzik);
        double sonuc = toplam/5;

        System.out.println("Ortalamanız: " + sonuc );

        String durum = sonuc>=50 ? "Geçtiniz" : "Kaldınız";
        System.out.println(durum);

    }
}

