/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.Date;

/**
 *
 * @author Neha Ghate
 */
public class Drug {
    
    private int drugID;
    private String drugName;
    private String expirationDate;
    private String manufacturedDate;
    private String composition;
    private String drugType;
    private String drugDescription;
    private int drugAvailibility;
    private int drugPrice;

    private static int count;
    
    public Drug(){
        count++;
        drugID = count;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(String manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }
    
    public String getDrugDescription() {
        return drugDescription;
    }

    public void setDrugDescription(String drugDescription) {
        this.drugDescription = drugDescription;
    }

    public int getDrugAvailibility() {
        return drugAvailibility;
    }

    public void setDrugAvailibility(int drugAvailibility) {
        this.drugAvailibility = drugAvailibility;
    }

    public int getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(int drugPrice) {
        this.drugPrice = drugPrice;
    }

    public int getDrugID() {
        return drugID;
    }

    public void setDrugID(int drugID) {
        this.drugID = drugID;
    }
   
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

      @Override
    public String toString() {
       // return "Drug{" + "drugID=" + drugID + '}';
        return drugName;
    }
    
   
}
