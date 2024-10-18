// 12S24035 - JOSUA SIANTURI
// 12S24058 - AIRENE SITUMORANG

import java.util.*;
import java.lang.Math;

public class M01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int totalkredit, indeks;
        double performa, indekssementara, performaakhir, nilaiangka;
        double a, aB, b, bC, c, d, e;
        String nilaihuruf, kredit;

        totalkredit = 4.0;
        kredit = input.nextLine();
        while (!kredit.equals("---")) {
            nilaihuruf = input.nextLine();
            if (nilaihuruf.equals("A")) {
                nilaiangka = 4.0;
            } else {
                if (nilaihuruf.equals("AB")) {
                    nilaiangka = 3.5;
                } else {
                    if (nilaihuruf.equals("B")) {
                        nilaiangka = 3.0;
                    } else {
                        if (nilaihuruf.equals("BC")) {
                            nilaiangka = 2.5;
                        } else {
                            if (nilaihuruf.equals("C")) {
                                nilaiangka = 2.0;
                            } else {
                                if (nilaihuruf.equals("D")) {
                                    nilaiangka = 1.0;
                                } else {
                                    if (nilaihuruf.equals("E")) {
                                        nilaiangka = 0.0;
                                    } else {
                                        nilaiangka = 0.0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            performa = totalkredit * nilaiangka;
            System.out.println(performa);
            kredit = input.nextLine();
        }
    }
}
