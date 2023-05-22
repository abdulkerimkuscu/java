package OgrenciBilgi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Hilal Teze", "MAT", "0553");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "1232");
        Teacher t3 = new Teacher("Ahmet Kaya", "BIO", "3213");

        Course matematik = new Course("Matematik", "101", "MAT");
        matematik.addTeacher(t1);

        Course fizik = new Course("Fizik", "202", "FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "303", "BIO");

        biyoloji.addTeacher(t3);

        Student s1 = new Student("Artuk", "169", "4", matematik, fizik, biyoloji);

        s1.addBulkExamNote(100, 100,100);
        s1.addBulkVivaNote(100, 100, 100);
        s1.noteAverage();
        s1.isPass();



    }
}
