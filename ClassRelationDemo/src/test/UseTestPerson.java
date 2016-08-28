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
public class UseTestPerson {
    public static void main(String[] args) {
        
        Person p=new Student();
        p.test(); //Compile Time
        p.display(); //Run time
    }
}
