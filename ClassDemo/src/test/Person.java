
package test;

import java.util.Objects;

public class Person {
    private int id;
    String name;
    private Float age;
    private String address;
    
    public Person() //Empty constructor
    {
        this.id=0;
        this.name="";
        age=0.0f;
    }
    public Person(Integer i,String n,Float a,String ad)
    {
        this.id=i;
        name=n;
        age=a;
        address=ad;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public  void display()
    {
        System.out.println("ID is "+id);
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Address is "+address);
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Float getAge() {
        return age;
    }

    public void setAge(Float age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getName()
    {
        return this.name;
    }
    
}
