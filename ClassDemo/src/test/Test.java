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
public class Test {
    public static void main(String[] args) {
        
        int a=2;
        test(a);
        System.out.println(a);
        
        Integer aa=2;
        test(aa);
        System.out.println(aa);
        
        Person p=new Person(1, "hari", 23f, "damak");
        test(p);
        System.out.println(p.getName());
        
        int[] c=new int[2];
        c[0]=2;
        test(c);
        System.out.println(c[0]);
        
        test(c[0]);
        System.out.println(c[0]);
        
    }
    public static void test(int a)
    {
        a++;
    }
    public static void test(Integer a)
    {
        a++;
    }
    public static void test(Person p)
    {
      // p.setName("sita");
        p=new Person();
    }
    public static void test(int[] a)
    {
        a[0]++;
    }
}
