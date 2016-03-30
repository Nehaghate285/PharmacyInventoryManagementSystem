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
public class MasterOrderCatalog {
    private ArrayList<Order> orderCatalog;

    public MasterOrderCatalog(){
        orderCatalog = new ArrayList<Order>();
    }
    
    public Order addOrder(Order o){
        
        orderCatalog.add(o);
        return o;
    }
    
    public ArrayList<Order> getOrderCatalog() {
        return orderCatalog;
    }

    public void setOrderCatalog(ArrayList<Order> orderCatalog) {
        this.orderCatalog = orderCatalog;
    }
    
}
