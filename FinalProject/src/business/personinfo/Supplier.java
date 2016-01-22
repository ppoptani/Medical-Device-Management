/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.personinfo;

import business.model.ProductCatalog;

/**
 *
 * @author pu
 */
public class Supplier extends Person{
    
      private ProductCatalog productCatalog;    

    public Supplier() {
        productCatalog = new ProductCatalog();
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }  

    @Override
    public String toString() {
        return this.getFirstName(); //To change body of generated methods, choose Tools | Templates.
    }

}
