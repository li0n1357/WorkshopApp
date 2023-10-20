package org.ulpgc.is1.model;

public class Item {
    private Integer quantity;

    public Item(Integer quantity){
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
