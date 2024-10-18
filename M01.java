// 12S24035 - JOSUA SIANTURI
// 12S24058 - AIRENE SITUMORANG

import java.util.*;
import java.lang.Math;

public class M01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nilaihuruf;
        double angka, peforma;
        String indeks;

        indeks = input.nextLine();
        while (!indeks.equals("---")) {
            nilaihuruf = input.nextLine();
            if (nilaihuruf.equals("A")) {
                angka = 4.0;
            } else {
                if (nilaihuruf.equals("AB")) {
                    angka = 3.5;
                } else {
                    if (nilaihuruf.equals("B")) {
                        angka = 3.0;
                    } else {
                        if (nilaihuruf.equals("BC")) {
                            angka = 2.5;
                        } else {
                            if (nilaihuruf.equals("C")) {
                                angka = 2.0;
                            } else {
                                if (nilaihuruf.equals("D")) {
                                    angka = 1.0;
                                } else {
                                    angka = 0.0;
                                }
                            }
                        }
                    }
                }
            }
            peforma = Integer.parseInt(indeks) * angka;
            System.out.println(toFixed(peforma,1));
            indeks = input.nextLine();
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
