/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dimitris
 */
public class Items {
    private String id;
    private String name;
    
    public Items(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Items)) {
            return false;
        }
        Items comparedItems = (Items) compared;
        
        return (this.id.equals(comparedItems.id));
    }
    public String toString() {
        return this.id + ": " + this.name;
    }    
}
