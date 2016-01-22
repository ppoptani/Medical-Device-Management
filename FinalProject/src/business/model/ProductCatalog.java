/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import java.util.ArrayList;

/**
 *
 * @author pu
 */
public class ProductCatalog {
    
    private ArrayList<Product> productDirectory;

    public ProductCatalog() {
        productDirectory = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductDirectory() {
        return productDirectory;
    }

    public void setProductDirectory(ArrayList<Product> productDirectory) {
        this.productDirectory = productDirectory;
    }

    public Product addProduct() {
        Product product = new Product();
        productDirectory.add(product);
        return product;
    }

    public void removeProduct(Product product) {
        productDirectory.remove(product);
    }

    public Product searchProduct(int productId) {

        for (Product product : productDirectory) {
            if (product.getProductId() == productId) {
                return product;
            }
        }

        return null;
    }
    
    public boolean isUniqueSerialNumber(String serialNumber){
        
        for(Product product: productDirectory){
            if(product.getSerialNumber().equalsIgnoreCase(serialNumber)){
                return false;
            }
        }
        return true;
    }
    
}
