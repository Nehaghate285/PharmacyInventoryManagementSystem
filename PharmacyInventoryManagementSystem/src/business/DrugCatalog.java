/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author Neha Ghate
 */
public class DrugCatalog {
    
private ArrayList<Drug> drugList;


    public DrugCatalog(){
    this.drugList = new ArrayList<Drug>();
}
    public ArrayList<Drug> getDrugList() {
        return drugList;
    }

    public void setDrugList(ArrayList<Drug> drugList) {
        this.drugList = drugList;
    }

    public Drug addDrugs(Drug d) {
       // Drug d = new Drug();
        drugList.add(d);
        return d;
        
    }
    public void removeDrug(Drug d)
    {
        drugList.remove(d);
    }
    
     
}
