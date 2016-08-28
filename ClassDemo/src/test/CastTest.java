/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Suyash
 */
public class CastTest {

    public static void main(String[] args) {
        int a[] = {1, 2, 053, 4};
        int b[][] = {{1, 2, 4}, {2, 2, 1}, {0, 43, 2}};
        int c[] = new int[] {2,4};
        System.out.println(a[3] == b[0][2]);
        System.out.println(a[2]);
        System.out.println(b[2][1]);
        System.out.print(" " + (a[2] == b[2][1]));
    }
}