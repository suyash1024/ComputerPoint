
package classrelationdemo;


public class Keyboard extends Hardware
{
    private String type;
    public Keyboard(String name,String  brand,Float price, String type)
    {
        super(name,brand,price);
        this.type=type;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
        display();
    }
    public void display()
    {
        super.display();
        System.out.println("Type is "+type);
    }
    }
