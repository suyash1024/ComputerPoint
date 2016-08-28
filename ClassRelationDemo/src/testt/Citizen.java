/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testt;

/**
 *
 * @author Suyash
 */
public class Citizen implements PersonalInfo {
    private CitizenPersonalInfo personalInfo;
    private CitizenCrimeInfo crimeInfo;
    private CitizenDueInfo dueInfo;

    public CitizenPersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(CitizenPersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public CitizenCrimeInfo getCrimeInfo() {
        return crimeInfo;
    }

    public void setCrimeInfo(CitizenCrimeInfo crimeInfo) {
        this.crimeInfo = crimeInfo;
    }

    public CitizenDueInfo getDueInfo() {
        return dueInfo;
    }

    public void setDueInfo(CitizenDueInfo dueInfo) {
        this.dueInfo = dueInfo;
    }
    
}
