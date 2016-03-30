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
public class PharmacyDirectory {
    
    ArrayList<Pharmacy> pharmaList;

    public PharmacyDirectory(){
        this.pharmaList =  new ArrayList<Pharmacy>();
    }
    public ArrayList<Pharmacy> getStoreList() {
        return pharmaList;
    }

    public void setStoreList(ArrayList<Pharmacy> storeList) {
        this.pharmaList = storeList;
    }

    public Pharmacy addPharmacy(Pharmacy pharma) {

        //Pharmacy pharma = new Pharmacy();
        pharmaList.add(pharma);
        return pharma;
    }

    public void removeSupplier(Pharmacy pharmacy) {
     pharmaList.remove(pharmacy);
    }

    public Drug searchDrug(int drugID)
    {
        for(Pharmacy p : pharmaList){
        for(Drug drug : p.getDrugCatalog().getDrugList()){
            if(drugID == drug.getDrugID())
                return drug;
        }
         }
        return null;
    }
}
