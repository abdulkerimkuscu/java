package BoxingMatch;

public class Main {
    public static void main(String[] args) {
        Figther f1 = new Figther("A", 10, 100, 120, 60);
        Figther f2 = new Figther("B", 20, 85, 90,0);
        Match match = new Match(f1, f2, 50, 100);
        match.run();
    }
}
