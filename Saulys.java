package Daiva_Baltranaite_ZP_20;

import java.util.Scanner;

public class Saulys {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite taikinio centro koordinates x0 ir y0: ");
        int x1 = reader.nextInt();
        int y1 = reader.nextInt();
        System.out.println("Iveskite kiek kartu saulys saus i taikini: ");
        int n = reader.nextInt();
        int suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Iveskite pataikymo tasko koordinates x ir y: ");
            int x2 = reader.nextInt();
            int y2 = reader.nextInt();
            double atstumas = skaiciuotiAtstuma(x1, x2, y1, y2);
            System.out.printf("Atstumas: %.2f \n", atstumas);
            int taskai = taskai(atstumas);
            System.out.println("Uz si suvi saulys gavo: " + taskai + " taskus.");
            suma = suma + taskai;
        }
        System.out.println("Bendra tasku suma: " + suma);
        reader.close();
    }

    public static double skaiciuotiAtstuma(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static int taskai(double atstumas) {
        if (atstumas < 10 && atstumas > 0) {
            if (atstumas < 5) {
                return 10;
            } else {
                return 5;
            }
        }
        return 0;
    }

}
