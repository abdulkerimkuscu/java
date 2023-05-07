package pratikler;

import java.util.Scanner;

public class NotOrtalamasi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, turk, fiz, kim, muz;
        boolean check = true;
        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();
        int matematik = (mat > 100 || mat < 0) ? 0 : mat;
        System.out.print("Türkçe Notunuz: ");
        turk = input.nextInt();
        int turkce = (turk> 100 || turk < 0) ? 0 : turk;
        System.out.print("Fizik Notunuz: ");
        fiz = input.nextInt();
        int fizik = (fiz> 100 || fiz < 0) ? 0 : fiz;
        System.out.print("Kimya Notunuz: ");
        kim = input.nextInt();
        int kimya = (kim> 100 || kim < 0) ? 0 : kim;

        System.out.print("Müzik Notunuz: ");
        muz = input.nextInt();
        int muzik = (muz> 100 || muz < 0) ? 0 : muz;

        int toplam = (matematik + turkce + fizik + kimya + muzik);
        double sonuc = toplam/5;

        System.out.println("Ortalamanız: " + sonuc );

        String durum = sonuc>=50 ? "Geçtiniz" : "Kaldınız";
        System.out.println(durum);

    }
}
