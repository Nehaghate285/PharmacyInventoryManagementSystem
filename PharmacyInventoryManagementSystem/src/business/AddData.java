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
public class AddData {
    
    public void setInitialValues(PharmacyDirectory pharmacyDirectory)
            
    {
        PharmacyDirectory pharmaDirectory = pharmacyDirectory;
        
       Pharmacy pharma1 = new Pharmacy();
               
       Pharmacy pharma2 = new Pharmacy();
       
               
       pharma1.setStoreName("pharma1");
       pharma2.setStoreName("pharma2");
        
       pharmaDirectory.addPharmacy(pharma1);
      pharmaDirectory.addPharmacy(pharma2);
        Drug drug1 = new Drug();
        
        
        //drug1.setDrugID(1);
        drug1.setDrugName("Crocin");
        drug1.setDrugType("paracetemol");
        drug1.setComposition("paracetemol ");
        drug1.setDrugAvailibility(40);
        drug1.setDrugPrice(20);
        drug1.setDrugDescription("used for fever");
        drug1.setExpirationDate("20-05-2018");
        drug1.setManufacturedDate("10-09-2015");
        pharma1.getDrugCatalog().addDrugs(drug1);
        
        Drug drug2 = new Drug();
        //drug2.setDrugID(2);
        drug2.setDrugName("Anacin");
        drug2.setDrugType("antacid");
        drug2.setComposition("antacid ");
        drug2.setDrugAvailibility(80);
        drug2.setDrugPrice(30);
        drug2.setDrugDescription("used for acidity");
        drug2.setExpirationDate("20-10-2018");
        drug2.setManufacturedDate("10-10-2015");
        pharma1.getDrugCatalog().addDrugs(drug2);
        
        Drug drug12 = new Drug();
        //drug12.setDrugID(3);
        drug12.setDrugName("Cetaphil");
        drug12.setDrugType("cetaphil");
        drug12.setComposition("antacid ");
        drug12.setDrugAvailibility(80);
        drug12.setDrugPrice(30);
        drug12.setDrugDescription("used for acne");
        drug12.setExpirationDate("20-10-2018");
        drug12.setManufacturedDate("10-10-2015");
        pharma2.getDrugCatalog().addDrugs(drug12);
        
    }
    public void setStoreInitialValues(StoreDirectory storeDirectory){
        StoreDirectory sd = storeDirectory;
        
        Store store1 = new Store();
        
        Store store2 = new Store();
        
        
        store1.setStoreName("Store 1");
        store1.setStoreLocation("Boston");
        sd.addStore(store1);
        
        store2.setStoreName("Store 2");
        store2.setStoreLocation("New york");
        sd.addStore(store2);
        
       
    }
                
}
