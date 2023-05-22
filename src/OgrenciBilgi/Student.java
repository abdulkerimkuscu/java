package OgrenciBilgi;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;


    }

    void addBulkExamNote(double c1Note,  double c2Note,  double c3Note) {
        if (c1Note >= 0 && c1Note <= 100) {
            this.c1.note = c1Note;
        }

        if (c2Note >= 0 && c2Note <= 100) {
            this.c2.note = c2Note;
        }

        if (c3Note >= 0 && c3Note <= 100) {
            this.c3.note = c3Note;
        }


    }
    void addBulkVivaNote(double c1VivaNote,double c2VivaNote,double c3VivaNote){
        if (c1VivaNote >= 0 && c1VivaNote <= 100) {
            this.c1.vivaNote = c1VivaNote;
        }
        if (c2VivaNote >= 0 && c2VivaNote <= 100) {
            this.c2.vivaNote = c2VivaNote;
        }
        if (c3VivaNote >= 0 && c3VivaNote <= 100) {
            this.c3.vivaNote = c3VivaNote;
        }
    }
     void noteAverage() {
        this.c1.finale = (this.c1.note * 0.8) + (this.c1.vivaNote * 0.2);
        this.c2.finale = (this.c2.note *0.8) + (this.c2.vivaNote * 0.2);
        this.c3.finale = (this.c3.note * 0.8) + (this.c3.vivaNote * 0.2);
    }

    void isPass() {
        printNote();
        this.avarage = (this.c1.finale+ this.c2.finale+this.c3.finale)/3.0;
        System.out.println("Ortalamanız\t:" + this.avarage);

        if (this.avarage > 50) {
            System.out.println("Sınıfı Geçtiniz");
        } else {
            System.out.println("Sınıfta Kaldınız");
        }

    }

    void printNote() {
        System.out.println("Adınız: " +this.name);
        System.out.println("=========================");
        System.out.println(this.c1.name + " Notu\t:" + this.c1.note);
        System.out.println(this.c1.name + " Sözlü Notu:" + this.c1.vivaNote);
        System.out.println(this.c1.name+ " Ortalamanız:"+ this.c1.finale);
        System.out.println(this.c2.name + " Notu\t\t:" + this.c2.note);
        System.out.println(this.c2.name + " Sözlü Notu:" + this.c2.vivaNote);
        System.out.println(this.c2.name+ " Ortalamanız:"+ this.c2.finale);
        System.out.println(this.c3.name + " Notu\t:" + this.c3.note);
        System.out.println(this.c3.name + " Sözlü Notu:" + this.c3.vivaNote);
        System.out.println(this.c3.name+ " Ortalamanız:"+ this.c3.finale);
        System.out.println("=========================");

    }

}
