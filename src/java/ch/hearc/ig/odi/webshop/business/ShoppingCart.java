package ch.hearc.ig.odi.webshop.business;

import java.util.HashMap;

/**
 *
 * @author Melissa Voirol <melissa.voirol@he-arc.ch>
 */
public class ShoppingCart {

    private Long id;
    private Double total = 0.00;
    private HashMap<Long, LineItem> items;

    public ShoppingCart(Long id, Double total) {
        this.id = id;
        this.total = total;
        this.items = new HashMap<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public HashMap<Long, LineItem> getItems() {
        return items;
    }

    public void setItems(HashMap<Long, LineItem> items) {
        this.items = items;
    }

}
