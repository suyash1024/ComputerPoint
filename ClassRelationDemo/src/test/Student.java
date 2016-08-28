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
public class Student extends Person
{
    
    public static void test()
    {
         Person.test();
        System.out.println("Student");
    }
   
    public void display(){
        System.out.println("Student display");
    }
}
