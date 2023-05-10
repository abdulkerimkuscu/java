package pratikler;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        double balance = 5000, amount;
        String userName, password;
        int right = 3, select;
        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Kullanıcı Adı: ");
            userName = input.next();
            System.out.print("Şifre: ");
            password = input.next();
            if (userName.equals("patika") && password.equals("123")) {
                System.out.println("Giriş Yapıldı!");
                do {
                    System.out.println("Yapmak istediğiniz işlemi seçiniz\n1-Para Çekme\n2-Para Yatırma\n3-Bakiye Sorgula\n4-Çıkış yap");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı Giriniz: ");
                            amount = input.nextDouble();
                            if (amount > balance) {
                                System.out.println("Bakiyeniz Yetersiz!!!");
                                System.out.println("********************");

                            } else {
                                balance -= amount;
                                System.out.println("Güncel Bakiye: " + balance);
                                System.out.println("********************");

                            }
                            break;
                        case 2:
                            System.out.print("Para miktarı Giriniz: ");
                            amount = input.nextDouble();
                            balance += amount;
                            System.out.println("Güncel Bakiye: " + balance);
                            System.out.println("********************");
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            System.out.println("********************");

                            break;

                    }
                } while (select != 4);
                System.out.println("Çıkış Yapıldı!");
                break;
            } else {
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız bloke edilmiştir. Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz.\nKalan hakkınız: " + right);
                }
            }


        }
    }
}
