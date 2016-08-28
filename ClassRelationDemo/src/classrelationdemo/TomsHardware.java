
package classrelationdemo;

public class TomsHardware {
    public static void main(String[] args) {
       Keyboard k=new Keyboard("Keyboard","Dell",300f,"USB");
       Processor[] processors={new Processor("xx", "aa", 45f, 4f),
                            new Processor("yy","bb",45f,4f)};
        MotherBoard m=new MotherBoard("g31", "intel", 7000f, 2, processors);
        SMPS smps=new SMPS("SMPS","Intel", 1700f, 4, 220f);
        //Write code to send hardware array to displayBill Method
            //**********create array of hardware using above objects
           Hardware[] hardwares={k,m,smps};
//            Hardware[] hardwares=new Hardware[3];
//                hardwares[0]=k;
//                hardwares[1]=m;
//                hardwares[2]=smps;
            //**********call display Bill Method with above created array as argument
            displayBill(hardwares);
            
            for(Processor p:processors)
            {
                p.display();
               
            }
        
    }
    public static void display(MotherBoard m)
    {
        System.out.println("***********MotherBoard Details**************");
        m.display();
        System.out.println("Number of slots"+m.getNoOfSlots());
        Processor[] processors=m.getProcessor();
          System.out.println("***********Processor Details**************");
        for(Processor p:processors)
        {
            p.display();
            System.out.println("Speed is "+p.getSpeed());
            p.setName("Core i3");
        }
    }
    
    public static void displayBill(Hardware[] hardwares)
    {
        float total=0f;
       for(Hardware hardware:hardwares)
       {
           display(hardware);
           if(hardware instanceof MotherBoard)
           {
              MotherBoard m=(MotherBoard)hardware;
              for(Processor p:m.getProcessor())
              {
                  display(p);
                    p.setName("Core i3");
                  total=total+p.getPrice();
              }
              
           }
           
           total=total+hardware.getPrice();
           System.out.println("*************************************************");
       }
       System.out.println("Total price is "+total);
    }
    public static void display(Hardware hardware)
    {
        System.out.println("Hardware Name is "+hardware.getName());
           System.out.println("Price is "+hardware.getPrice());
    }
}
