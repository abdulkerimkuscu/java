package PatikaStore;

import java.util.Scanner;

public class PatikaStore {
    Scanner input = new Scanner(System.in);

    public void run(){
        boolean isExit = false;
        while (!isExit){
            System.out.println("PatikaStore Product Management Panel");
            System.out.println("1- NoteBooks");
            System.out.println("2- Phones");
            System.out.println("3- List Of Brands");
            System.out.println("0- Exit");
            System.out.print("Select Your Choice: ");
            int choose = input.nextInt();

            while (choose<0 || choose>3){
                System.out.println("Wrong selection!! Try Again: ");
                choose = input.nextInt();

            }

            switch (choose){
                case 1 :
                    NoteBook n1 = new NoteBook();
                    n1.menu();
                    break;
                case 2:
                    Phone p1 = new Phone();
                    p1.menu();
                    break;
                case 3:
                    Brand b1 = new Brand();
                    b1.menu();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Selection!");
                    break;
            }

        }
    }
}
