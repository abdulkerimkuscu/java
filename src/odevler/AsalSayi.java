package odevler;

public class AsalSayi {
    public static void main(String[] args) {
        System.out.println("Birden 100 e Kadar Olan Asal Sayılar");


        //Bölünen Oluşturma
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            //Bölen oluşturma
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }

    }
}
