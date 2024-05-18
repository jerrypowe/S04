/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.util.Scanner;

/**
 *
 * @author Tam Pham
 */
public class Mylib {
     public static int GetPositiveInteger(String msg, String errMsg) throws Exception {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println(msg);
                n = Integer.parseInt(sc.nextLine());
                if (n <= 0) {
                    throw new Exception(errMsg);

                }
                return n;

            } catch (Exception e) {
                  System.out.println(errMsg);
            }

        } while (true);
    }

    public static double GetPositiveDouble(String msg, String errMsg) throws Exception {
        double n = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println(msg);
                n = Double.parseDouble(sc.nextLine());
                if (n <= 0) {
                    throw new Exception(errMsg);

                }
                return n;

            } catch (Exception e) {
                System.out.println(errMsg);
            }

        } while (true);
    }
}
