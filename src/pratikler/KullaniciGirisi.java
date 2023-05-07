package pratikler;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "1234";
        System.out.print("Lütfen Şifrenizi Giriniz :");
        String userPassword = input.next();
        String newPassword = "";
        boolean check =true;

        if(userPassword.equals(password)){
            System.out.println("Başarılı bir şekilde giriş yaptınız!");
        }
        else {
            System.out.println("Şifre Yanlış\n Yeni şifre almak için 1\'e basınız\n Çıkış yapmak için 2\'ye basınız");
        }

        int option = input.nextInt();
        if (option == 1) {
            while (check) {
                System.out.print("Lütfen yeni şifrenizi giriniz: ");
                newPassword = input.next();
                if ((newPassword.equals(password)))
                    System.out.println("Şifre önceki şifre ile aynı olamaz.");

                else {
                    System.out.print("Şifre oluşturuldu");
                    check = false;
                }

            }
        } else if (option == 2) {
            System.out.println("Çıkış yapılıyor...");
            System.exit(0);
        }
        }
    }

