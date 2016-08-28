
package test;


public class UsePerson {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setName("Ram");
        p1.display();
        
        Person p2=new Person(1,"Hari",23f,"Damak ");
        p2.display();
        
        Object o=p2;
        System.out.println(o.toString());
        System.out.println(p2.getClass());
        System.out.println(o.getClass());
        
    }
}
