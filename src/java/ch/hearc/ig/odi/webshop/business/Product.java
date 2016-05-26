package ch.hearc.ig.odi.webshop.business;

import java.util.HashMap;

/**
 *
 * @author Melissa Voirol <melissa.voirol@he-arc.ch>
 */
public class Product {

    private Long id;
    private String name;
    private String description;
    private HashMap<Long, LineItem> items;

    public Product(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.items = new HashMap<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HashMap<Long, LineItem> getItems() {
        return items;
    }

    public void setItems(HashMap<Long, LineItem> items) {
        this.items = items;
    }

}
