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
public class Processor extends Hardware
{
    private Float speed;

    public Processor( String name, String brand, Float price,Float speed) {
        super(name, brand, price);
        this.speed = speed;
    }

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }
    
}
