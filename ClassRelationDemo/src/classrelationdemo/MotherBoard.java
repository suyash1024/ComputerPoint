
package classrelationdemo;


public class MotherBoard extends Hardware {
    
    private Integer noOfSlots;
    private Processor[] processor;

    public MotherBoard(String name, String brand, Float price,Integer noOfSlots, Processor[] processor) {
        super(name, brand, price);
        this.noOfSlots = noOfSlots;
        this.processor = processor;
    }

    public Processor[] getProcessor() {
        return processor;
    }

    public void setProcessor(Processor[] processor) {
        this.processor = processor;
    }

    public Integer getNoOfSlots() {
        return noOfSlots;
    }

    public void setNoOfSlots(Integer noOfSlots) {
        this.noOfSlots = noOfSlots;
    }
    public Float getPower(SMPS smps)
    {
        return smps.getMaxVolt();
    }
}
