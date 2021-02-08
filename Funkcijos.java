package Daiva_Baltranaite_ZP_20;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Funkcijos {

    public static int[] readerGrades(int n) {
        Scanner rd = new Scanner(System.in);
        int[] pazymiai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Iveskite pazymi nuo 1 iki 10: ");
            int pazymis = rd.nextInt();
            pazymiai[i] = pazymis;
        }
//        rd.close();
        return pazymiai;
    }

    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int randomGrades() {
        return randomNumber(1, 10);
    }

    public static void printGrades(int[] pazymiai) {
        System.out.println(Arrays.toString(pazymiai));
    }

    public static int getAvg(int[] pazymiai) {
        int suma = 0;
        for (int i = 0; i < pazymiai.length; i++) {
            suma = pazymiai[i] + suma;
        }
        int vidurkis = suma / pazymiai.length;
        return vidurkis;
    }

    public static int getMax(int[] pazymiai) {
        return Arrays.stream(pazymiai).max().getAsInt();
    }

    public static int getMin(int[] pazymiai) {
        return Arrays.stream(pazymiai).min().getAsInt();
    }

    public static int getMediana(int[] pazymiai) {
        Arrays.sort(pazymiai);
        return pazymiai[pazymiai.length / 2];
    }

    public static int getPercent(int[] pazymiai) {
        int neislaike = 0;
        int procentas = 0;
        for (int i = 0; i < pazymiai.length; i++) {
            if (pazymiai[i] < 4) {
                neislaike++;
            }
        }
        int islaike = pazymiai.length - neislaike;
        procentas = (100 / pazymiai.length) * islaike;
        return procentas;
    }

    public static void printHistogram(int[] pazymiai) {
        Arrays.sort(pazymiai);
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ": ");
            for (int pazymis : pazymiai) {
                if (pazymis == i) {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}
