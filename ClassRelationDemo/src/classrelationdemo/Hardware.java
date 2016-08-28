
package classrelationdemo;

public class Hardware 
{
    private String name;
    private String brand;
    private Float price;

//    public Hardware() {
//      //  this("","",0f);
//    }

    public Hardware(String name,String brand,Float price)
    {
        this.name=name;
        this.brand=brand;
        this.price=price;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void display()
    {
        System.out.println("Name is "+getName());
        System.out.println("Brand is "+getBrand());
        System.out.println("Price is "+price);
       // return ;
    }
}
