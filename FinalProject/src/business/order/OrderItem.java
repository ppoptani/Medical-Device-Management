/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.order;

import business.enterprise.SupplierEnterprise;
import business.model.Product;

/**
 *
 * @author pu
 */
public class OrderItem {

    private Product product;
    private int quantity;
    private SupplierEnterprise supplierName;

    public OrderItem() {

    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public SupplierEnterprise getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(SupplierEnterprise supplierName) {
        this.supplierName = supplierName;
    }

    @Override
    public String toString() {
        return product.getName();
    }

}
