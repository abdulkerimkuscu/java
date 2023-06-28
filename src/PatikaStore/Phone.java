package PatikaStore;

import java.util.ArrayList;
import java.util.Scanner;

public class Phone extends Product {
    Scanner input = new Scanner(System.in);
    Brand b1 = new Brand();
    ArrayList<Phone> phone = new ArrayList<>();
    private String color;
    private int batteryPow;

    public Phone(int id, String name, int price, double discount, int stock, Brand brand, int ram, int storage, double screenSize, String color, int batteryPow) {
        super(id, name, price, discount, stock, brand, ram, storage, screenSize);
    }
    public Phone(){}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBatteryPow() {
        return batteryPow;
    }

    public void setBatteryPow(int batteryPow) {
        this.batteryPow = batteryPow;
    }

    @Override
    public void menu() {
        System.out.println("------ Phone Menu ------");
        System.out.println("1- Add Phone");
        System.out.println("2- Delete Phone");
        System.out.println("3- List Phones");
        System.out.println("------ Phone Menu ------");
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
        System.out.print("Enter the Product Color: ");
        String color = input.next();
        System.out.print("Enter Battery Size: ");
        int battery = input.nextInt();

        Phone p1 = new Phone(idGenerator(), name, price, discount, stock, brand, ram, storage, screenSize, color, battery);
        this.phone.add(p1);
        System.out.println("Phone Added!");
        System.out.println("Name: " + p1.getName() + "\t Id: " + p1.getId());
        menu();
    }

    @Override
    public void deleteItem() {
        System.out.println("Enter the id of the product you want to delete");
        int inputId = input.nextInt();

        for (Phone mobilePhone : phone) {
            if (mobilePhone.getId() == inputId) {
                System.out.println("The product was successfully deleted");
                System.out.println("Press 0 to return to the menu !");
                mobilePhone.deleteItem();
                break;
            } else {
                System.out.println("Product has not found");
            }
        }
        menu();
    }

    @Override
    public void getItem() {
        System.out.println("\n|ID------|Product Name-----|Price-----|Brand-----|Stock-----|Discount Rate-----|RAM------|Screen Size-----|Storage-----|Color-----|Battery");
        for (Phone mobilPhone : phone) {
            System.out.println(mobilPhone.getId() + "       " + mobilPhone.getName() + "        " + mobilPhone.getPrice() + "         " + mobilPhone.getBrand().getName() + "        " + mobilPhone.getStock() + "           " + mobilPhone.getDiscount() + "             " + mobilPhone.getRam() + "           " + mobilPhone.getScreenSize() + "            " + mobilPhone.getStorage() + "         " + mobilPhone.getColor() + "          " + mobilPhone.getBatteryPow());
        }

        menu();

    }

    private int idGenerator() {
        int id = (int) (Math.random() * 10000);
        for (Phone mobilePhone : phone) {
            while (id == mobilePhone.getId()) {
                id = (int) (Math.random() * 10000);
            }
        }
        return id;
    }
}
