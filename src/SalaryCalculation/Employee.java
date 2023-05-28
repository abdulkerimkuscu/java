package SalaryCalculation;

public class Employee {
    String name;
    double salary;
    int workHouse;
    int hireYear;

    Employee(String name, double salary, int workHouse, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHouse = workHouse;
        this.hireYear = hireYear;
    }

    public double tax() {
        double tax = 0;
        if (this.salary > 1000) {
            tax += (this.salary / 100) * 3;

        } else {
            tax = 0;
        }
        return tax;
    }

    public double bonus() {
        int bonusFee;
        if (this.workHouse > 40) {
            bonusFee = (this.workHouse - 40) * 30;
        } else {
            bonusFee = 0;
        }
        return bonusFee;

    }

    public double raiseSalary() {
        double increaseSalary = 0;

        if ((2021 - this.hireYear) < 10) {
            increaseSalary += (this.salary / 100) * 5;
        }
        if ((2021 - this.hireYear) > 9 && this.hireYear < 20) {
            increaseSalary += (this.salary / 100) * 10;
        }
        if ((2021 - this.hireYear) > 19) {
            increaseSalary += (this.salary / 100) * 15;
        }


        return increaseSalary;
    }

    public void printInfo() {
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHouse);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş Artışı: " + raiseSalary());
        System.out.println("Vergi ve Bonuslarla Birlikte Maaş: " + (this.salary - tax() + bonus()));
        System.out.println("Toplam Maaş: " + (this.salary + raiseSalary()));


    }

}
