/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classrelationdemo;

/**
 *
 * @author Suyash
 */
public class SMPS extends Hardware
{
    private Integer noOfSockets;
    private Float maxVolt;

    public Integer getNoOfSockets() {
        return noOfSockets;
    }

    public void setNoOfSockets(Integer noOfSockets) {
        this.noOfSockets = noOfSockets;
    }

    public Float getMaxVolt() {
        return maxVolt;
    }

    public void setMaxVolt(Float maxVolt) {
        this.maxVolt = maxVolt;
    }

    public SMPS( String name, String brand, Float price,Integer noOfSockets, Float maxVolt) {
        super(name, brand, price);
        this.noOfSockets = noOfSockets;
        this.maxVolt = maxVolt;
    }
    
}
