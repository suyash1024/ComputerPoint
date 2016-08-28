
package test;

public class UseBook {
    public static void main(String[] args) {
        //Object--> Identity, State(Data Member), Behaviour(Method)
        Book b1=new Book(1, "Let Us C", 400f);
        Book b2=new Book(1, "Let Us C", 400f);
        Book b3=b1;
        System.out.println("Book Name is "+b1.getBookName());
        System.out.println(b1);
        System.out.println(b1.toString());
        //Person p1=new Person();
        if(b1.equals(b2))
        {
            System.out.println("Both books have same values");
        }
        else
        {
            System.out.println("Both books have different values");
        }
        if(b1==b3)
        {
            System.out.println("Both are same objects");
        }
        else
        {
            System.out.println("Both are different objects");
        }
    }
}
