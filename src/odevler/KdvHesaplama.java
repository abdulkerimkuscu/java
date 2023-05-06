package odevler;


import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fiyat, kdvOran = 0.18, kdvTutar, kdvliFiyat;
        System.out.print("Ürün Fiyatı Giriniz: ");
        fiyat = input.nextDouble();
        kdvTutar = fiyat * kdvOran;
        kdvliFiyat = fiyat + kdvTutar;
        System.out.println("KDV\'siz Fiyat: " + fiyat);
        System.out.println("Kdv Tutarı: " + kdvTutar);
        System.out.println("KDV\'li Fiyat: " +kdvliFiyat);
    }

}
