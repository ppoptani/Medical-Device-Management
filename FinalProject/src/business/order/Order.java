/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.order;

import business.model.Product;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author pu
 */
public class Order {

    private static int count=1;
    private ArrayList<OrderItem> orderItemList;
    private int orderNumber;
    private String Status;
    private Date deliveryDate;

    public Order() {
        count++;
        orderNumber = count;
        orderItemList = new ArrayList<OrderItem>();
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void removeOrder(OrderItem orderItem) {
        orderItemList.remove(orderItem);
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public OrderItem addOrderItem(Product product, int quantity) {
        OrderItem orderItem = new OrderItem();

        orderItem.setProduct(product);
        orderItem.setQuantity(quantity);

        orderItemList.add(orderItem);
        return orderItem;
    }

}
