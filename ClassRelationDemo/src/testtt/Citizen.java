/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtt;

import test.Person;

/**
 *
 * @author Suyash
 */
public abstract class Citizen extends Person {
    
    private Integer citizenID;
    public Citizen()
    {
        
    }
    public abstract Float getFees();

    public Integer getCitizenID() {
        return citizenID;
    }

    public void setCitizenID(Integer citizenID) {
        this.citizenID = citizenID;
    }
    
}
