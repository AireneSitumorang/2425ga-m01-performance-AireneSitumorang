// 12S24035 - JOSUA SIANTURI
// 12S24058 - AIRENE SITUMORANG

import java.util.*;
import java.lang.Math;

public class M01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String hURUF, gRADE;
        int sKS;
        double aNGKA, tOTAL;

        gRADE = input.nextLine();
        while (!gRADE.equals("---")) {
            sKS = Integer.parseInt(gRADE);
            hURUF = input.nextLine();
            if (hURUF.equals("A")) {
                aNGKA = 4.0;
            } else {
                if (hURUF.equals("AB")) {
                    aNGKA = 3.5;
                } else {
                    if (hURUF.equals("B")) {
                        aNGKA = 3.0;
                    } else {
                        if (hURUF.equals("BC")) {
                            aNGKA = 2.5;
                        } else {
                            if (hURUF.equals("C")) {
                                aNGKA = 2.0;
                            } else {
                                if (hURUF.equals("D")) {
                                    aNGKA = 1.0;
                                } else {
                                    aNGKA = 0.0;
                                }
                            }
                        }
                    }
                }
            }
            tOTAL = aNGKA * sKS;
            System.out.println(toFixed(tOTAL,1));
            gRADE = input.nextLine();
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
