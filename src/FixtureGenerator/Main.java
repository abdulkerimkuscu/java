package FixtureGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teams = new ArrayList<>();
        addTeam(teams);
        addBayTeam(teams);
        ArrayList<String> matchList = match(teams);
        System.out.println();
        printMatch(matchList);
    }

    public static void addTeam(ArrayList array) {
        Scanner input = new Scanner(System.in);
        String team;
        System.out.println("Takım Girmeyi Sonlandırmak İçin 0'a Basınız");
        while (true) {
            System.out.print("Takım Giriniz: ");
            team = input.nextLine();
            if (team.equals("0")) {
                break;
            }
            array.add(team);
        }

    }

    public static void addBayTeam(ArrayList array) {
        if (array.size() % 2 == 1) {
            array.add("Bay");
        }
    }

    public static void printTeams(ArrayList<String> array) {
        for (String team : array) {
            System.out.println(team);
        }
    }

    public static ArrayList<String> match(ArrayList<String> array) {
        ArrayList matchList = new ArrayList<>();
        Collections.shuffle(array);
        String str1 = "";
        String str2 = "";

        for (int away = array.size() / 2; away < array.size(); away++) {
            for (int home = 0; home < array.size() / 2; home++) {
                if (home + away >= array.size()) {
                    int homeAway = (home + away) % (array.size() / 2);
                    str1 += array.get(home) + " vs " + array.get(homeAway) + "\n";
                    str2 += array.get(homeAway) + " vs " + array.get(home) + "\n";
                }else{
                    str1 += array.get(home) + " vs " + array.get(home+ away) + "\n";
                    str2 += array.get(home+ away) + " vs " + array.get(home) + "\n";
                }
            }
            matchList.add(str1);
            matchList.add(str2);
            str1 = "";
            str2 = "";
        }
        return matchList;
    }
    public static void printMatch(ArrayList<String> array){
        for(int i = 0; i<array.size(); i+=2){
            System.out.println(array.get(i));
        }
        for(int i = 1; i<array.size(); i+=2){
            System.out.println(array.get(i));
        }
    }
}
