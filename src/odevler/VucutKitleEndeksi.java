package odevler;

import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double  size, kg,index;

        System.out.print("Boyunuzu Giriniz: ");
        size = input.nextDouble();

        System.out.print("Kilonuzu Giriniz: ");
        kg = input.nextDouble();

        index = kg/ (size*size);

        System.out.print("Vücut Kitle Endeksiniz: "+index);
    }
}
