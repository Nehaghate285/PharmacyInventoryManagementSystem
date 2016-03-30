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
public class Order {
    private ArrayList<OrderItem> orderItemList;
    private int orderNumber;
    private static int count;

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    
    public Order()
    {
        orderItemList =  new ArrayList<>();
        count++;
        orderNumber=count;
        
    }

    public OrderItem addOrderItem(Drug d, int quantity, int price)
    {
        OrderItem orderItem = new OrderItem();
        orderItem.setDrug(d);
        orderItem.setQuantity(quantity);
        orderItem.setSalesPrice(price);
        orderItemList.add(orderItem);
        return orderItem;
    }

    @Override
    public String toString() {
        return String.valueOf(orderNumber);
    }
    
    public void removeOrderItem(OrderItem o)
    {
        orderItemList.remove(o);
    }
    
    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    
    
}
