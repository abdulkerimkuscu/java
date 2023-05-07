package pratikler;

import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.print("A sayısını giriniz: ");
        a= input.nextInt();
        System.out.print("B sayısını giriniz: ");
        b= input.nextInt();
        System.out.print("C sayısını giriniz: ");
        c= input.nextInt();

        if((a>b)&&(a>c)){
            if(b>c){
                System.out.println("A>B>C");
            }else{
                System.out.println("A>C>B");
            }

        } else if ((b>a)&&(b>c)) {
            if(a>c){
                System.out.println("B>A>C");
            }else {
                System.out.println("B>C>A");
            }

        }else {
            if(a>b){
                System.out.println("C>A>B");
            }
            else {
                System.out.println("C>B>A");
            }
        }

    }




}
