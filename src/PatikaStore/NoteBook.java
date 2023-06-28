package PatikaStore;

import java.util.ArrayList;
import java.util.Scanner;

public class NoteBook extends  Product{

    Scanner input = new Scanner(System.in);
    Brand b1 = new Brand();
    ArrayList<NoteBook> notebook = new ArrayList<>();
    public NoteBook(int id, String name, int price, double discount, int stock, Brand brand, int ram, int storage, double screenSize) {
        super(id, name, price, discount, stock, brand, ram, storage, screenSize);
    }
    public NoteBook(){}


    @Override
    public void menu() {
        System.out.println("------ Notebooj Menu ------");
        System.out.println("1- Add NoteBook");
        System.out.println("2- Delete NoteBook");
        System.out.println("3- List NoteBooks");
        System.out.println("------ NoteBook Menu ------");
        System.out.println("4- Exit");

        switch (input.nextInt()) {
            case 1:
                addItem();
                break;
            case 2:
                deleteItem();
                break;
            case 3:
                getItem();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Wrong Selection");
                break;
        }

    }

    @Override
    public void addItem() {
        System.out.println("Choose the Brand of the Product");
        System.out.println();
        System.out.println("--- Brands ---");
        b1.printBrands();
        System.out.print("Choose the Brand Id: ");
        Brand brand = Brand.getBrand(input.nextInt());

        System.out.print("Enter the Product Name: ");
        String name = input.next();
        System.out.print("Enter the Product Price: ");
        int price = input.nextInt();
        System.out.print("Enter Discount Rate: ");
        double discount = input.nextDouble();
        System.out.print("Enter Stock Quantity: ");
        int stock = input.nextInt();
        System.out.print("Enter Ram Size: ");
        int ram = input.nextInt();
        System.out.print("Enter Storage Size: ");
        int storage = input.nextInt();
        System.out.print("Enter Screen Size: ");
        double screenSize = input.nextDouble();
        NoteBook n1 = new NoteBook(idGenerator(), name, price, discount, stock, brand, ram, storage, screenSize);
        this.notebook.add(n1);
        System.out.println("Phone Added!");
        System.out.println("Name: " + n1.getName() + "\t Id: " + n1.getId());
        menu();


    }

    @Override
    public void deleteItem() {
        System.out.println("Enter the id of the product you want to delete");
        int inputId = input.nextInt();

        for (NoteBook nBook : notebook) {
            if (nBook.getId() == inputId) {
                System.out.println("The product was successfully deleted");
                System.out.println("Press 0 to return to the menu !");
                nBook.deleteItem();
                break;
            } else {
                System.out.println("Product has not found");
            }
        }
        menu();

    }

    @Override
    public void getItem() {
        System.out.println("\n|ID------|Product Name-----|Price-----|Brand-----|Stock-----|Discount Rate-----|RAM------|Screen Size-----|Storage");
        for (NoteBook nBook : notebook) {
            System.out.println(nBook.getId() + "       " + nBook.getName() + "        " + nBook.getPrice() + "         " + nBook.getBrand().getName() + "        " + nBook.getStock() + "           " + nBook.getDiscount() + "             " + nBook.getRam() + "           " + nBook.getScreenSize() + "            " + nBook.getStorage());
        }

        menu();

    }
    private int idGenerator() {
        int id = (int) (Math.random() * 10000);
        for (NoteBook nBook : notebook) {
            while (id == nBook.getId()) {
                id = (int) (Math.random() * 10000);
            }
        }
        return id;
    }
}
