package odevler;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, kg, total = 0.0;
        Scanner input = new Scanner(System.in);


        System.out.print("Kaç Kilo Armut Aldınız: ");
        kg = input.nextDouble();
        total += kg * armut;

        System.out.print("Kaç Kilo Elma Aldınız: ");
        kg = input.nextDouble();
        total += kg * elma;

        System.out.print("Kaç Kilo Domates Aldınız: ");
        kg = input.nextDouble();
        total += kg * domates;

        System.out.print("Kaç Kilo Muz Aldınız: ");
        kg = input.nextDouble();
        total += kg * muz;

        System.out.print("Kaç Kilo Patlıcan Aldınız: ");
        kg = input.nextDouble();
        total += kg * patlican;

        System.out.println(total);
    }
}
