

package com.javaee.tutorial.dukesbookstore.web.managedbeans;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * <p>Managed bean used by
 * <code>ShoppingCart</code> bean.</p>
 */
@Named
@SessionScoped
public class ShoppingCartItem implements Serializable {

    private static final long serialVersionUID = 4650160531351805680L;
    Object item;
    int quantity;

    public ShoppingCartItem() {
    }

    public ShoppingCartItem(Object anItem) {
        item = anItem;
        quantity = 1;
    }

    public void incrementQuantity() {
        quantity++;
    }

    public void decrementQuantity() {
        quantity--;
    }

    public Object getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
