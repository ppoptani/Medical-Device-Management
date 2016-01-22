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
public class CategoryCatalog {
    
    private ArrayList<Category> categories;

    public CategoryCatalog() {
        categories = new ArrayList<Category>();
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }
    
    public Category createCategory(){
        Category category = new Category();
        categories.add(category);
        return category;
    }
    
    public void removeCategory(Category category){
        categories.remove(category);
    }
    
    public boolean isUniqueCategoryName(String categoryName)
    {
        boolean isUnique = true;
        
       for(Category category:categories)
        {
            if(category.getCategoryName().equalsIgnoreCase(categoryName))
            {
                isUnique =false;
                break;
            }            
        }
       return isUnique;
    }
    
}
