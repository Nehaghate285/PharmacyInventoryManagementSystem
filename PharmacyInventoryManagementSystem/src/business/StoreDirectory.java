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
public class StoreDirectory {
    
    ArrayList<Store> storeList;
    
    public StoreDirectory(){
        this.storeList = new ArrayList<>();
    }

    public ArrayList<Store> getStoreList() {
        return storeList;
    }

    public void setStoreList(ArrayList<Store> storeList) {
        this.storeList = storeList;
    }
    
    public Store addStore(Store store){
        //Store store = new Store();
        storeList.add(store);
        return store;
    }
    public void removeStore(Store store){
        storeList.remove(store);
    }

   }
