package BoxingMatch;

public class Match {
    Figther f1;
    Figther f2;
    int minWeigth;
    int maxWeigth;

    Match(Figther f1, Figther f2, int minWeigth, int maxWeigth) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeigth = minWeigth;
        this.maxWeigth = maxWeigth;
    }

    void run() {
        if (isCheck()) {
            while(this.f1.health>0 && this.f2.health>0){
                double firstHit = Math.random() * 100;
                if (firstHit<=50){
                    this.f2.health = this.f1.hit(this.f2);
                }

                if (isWin()){
                    break;
                }
                if (100>=firstHit && firstHit>=50){
                    this.f1.health = this.f2.hit(this.f1);
                }

                if (isWin()){
                    break;
                }
                printScore();
            }

        }else{
            System.out.println("Sporcuların sikletleri uyuşmuyor");
        }
    }

    boolean isCheck() {
        return (this.f1.weigth >= minWeigth && this.f1.weigth <= maxWeigth) && (this.f2.weigth >= minWeigth && this.f2.weigth <= maxWeigth);
    }
    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçı Kazanan : " + f1.name);
            return true;
        }

        return false;
    }
    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
        System.out.println("------------");

    }
}
