/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

/**
 *
 * @author pu
 */
public class SurgeryType {
    
    private static int count = 1;
    private int surgeryId;
    private String typeName;
    
    public SurgeryType(){
        surgeryId = count;
        count++;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }  
    
}
