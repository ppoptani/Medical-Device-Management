/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workarea;

import business.order.Order;

/**
 *
 * @author pu
 */
public class NewDeviceOrderRequest extends WorkRequest {

    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public NewDeviceOrderRequest() {
        super(WorkRequest.WorkRequestType.NewDeviceOrderRequestType.getValue());
    }

}
