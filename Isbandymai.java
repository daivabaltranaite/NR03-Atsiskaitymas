package Daiva_Baltranaite_ZP_20;

import java.util.Arrays;

import static Daiva_Baltranaite_ZP_20.Funkcijos.*;

public class Isbandymai {

    public static void main(String[] args) {

        int[] pazymiai = readerGrades(10);
        System.out.println("Pazymiai: ");
        System.out.println(Arrays.toString(pazymiai));
        System.out.println("Random number: ");
        System.out.println(randomNumber(-100, 100));
        System.out.println("Random grade: ");
        System.out.println(randomGrades());
        System.out.println("Print grades:");
        printGrades(pazymiai);
        System.out.println("getAvg");
        System.out.println(getAvg(pazymiai));
        System.out.println("getMax");
        System.out.println(getMax(pazymiai));
        System.out.println("getMin");
        System.out.println(getMin(pazymiai));
        System.out.println("getMediana");
        System.out.println(getMediana(pazymiai));
        System.out.println("getPercent");
        System.out.println(getPercent(pazymiai));
        System.out.println("Histogram");
        printHistogram(pazymiai);
    }
}

