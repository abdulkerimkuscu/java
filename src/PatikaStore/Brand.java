package PatikaStore;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Brand {
    Scanner input = new Scanner(System.in);
    static TreeSet<Brand> brandList = new TreeSet<>(new Comparator<Brand>() {
        @Override
        public int compare(Brand o1, Brand o2) {
            return 1;
        }
    });
    private String name;
    private int id;

    static {
        createBrands();
    }
    public Brand(int id, String name){
        this.id = id;
        this.name = name;
    }
    public Brand(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void createBrands(){
        brandList.add(new Brand(1, "Apple"));
        brandList.add(new Brand(2, "Samsung"));
        brandList.add(new Brand(3, "Xiaomi"));
        brandList.add(new Brand(4, "Huawei"));
        brandList.add(new Brand(5, "Asus"));
        brandList.add(new Brand(6, "HP"));
        brandList.add(new Brand(7, "Casper"));
        brandList.add(new Brand(8, "Monster"));
    }
    public void printBrands(){
        for (Brand brand: brandList){
            System.out.println(brand.name + " - " + brand.id);
        }
        menu();
    }

    public static Brand getBrand(int id){
        for (Brand brand: brandList){
            if (id == brand.getId()) return brand;
        }
        return null;
    }

    public void menu(){
        System.out.println("---------Brand Menu--------");
        System.out.println("1- List Brands");
        System.out.println("2- Add Brand");
        System.out.println("3- Exit");

        switch (input.nextInt()){
            case 1:
                printBrands();
                break;
            case 2:
                System.out.print("Enter the name of the brand you want to add: ");
                String name = input.next();
                addBrand(name);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Wrong Selection!");
                break;
        }
    }

    public void addBrand(String name){
        int newID = brandList.size()+1;
        brandList.add(new Brand (newID,name));
        System.out.println("Brand: " + name + "\tid" + newID);
        menu();
    }
}


