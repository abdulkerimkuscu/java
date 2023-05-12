package odevler;

import java.util.Scanner;

public class BiletHesaplama {
    public static void main(String[] args) {
        // Kullanıcıdan bilgileri alıyoruz
        Scanner input = new Scanner(System.in);
        int age, tip;
        double km;
        String student;
        System.out.print("Kilometre Giriniz: ");
        km = input.nextDouble();
        System.out.print("Yaşınızı Giriniz: ");
        age = input.nextInt();
        System.out.print("Öğrenci Misiniz: ");
        student = input.next();
        System.out.print("Bilet Tipini Seçiniz 1- Gidiş, 2- Gidiş Dönüş : ");
        tip = input.nextInt();


        double normalPrice = 0, ageDiscount, studentDiscount, tipDiscount;
        // Km ve Yaş Bilgisi
        if (km > 0 && age > 0) {
            normalPrice = km * 0.10;
            if (age < 12) {
                ageDiscount = normalPrice * 0.50;
            } else if (age >= 65) {
                ageDiscount = normalPrice * 0.25;
            } else {
                ageDiscount = 0;
            }
            normalPrice -= ageDiscount;
        } else {
            System.out.println("Yaş veya Kilometre Bilgisi Geçersiz");
        }
        // Öğrenci Bilgisi
        if (student.equals("Evet")) {
            studentDiscount = normalPrice * 0.30;
            normalPrice -= studentDiscount;
        } else if (student.equals("Hayır")) {
            studentDiscount = 0;
        } else {
            System.out.println("Evet veya Hayır Dışında Bir Değer Girdiniz");
        }
        //Bilet Tipi
        if (tip == 2) {
            tipDiscount = normalPrice * 0.10;
            normalPrice = (normalPrice - tipDiscount) * 2;
        } else if (tip == 1) {
            tipDiscount = 0;
        } else {
            System.out.println("Girilen Bilgiler Hatalı!");
        }

        System.out.println("Bilet Tutarı : " + normalPrice + "TL");
    }
}

