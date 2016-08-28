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
public class test2 extends Test{
    
    public static void dosth(Test t)
    {
        System.out.println("in test2");
        t.dosthelse();
    }
    
    public void dosthelse()
    {
        System.out.println("in test2");
    }
    
}
