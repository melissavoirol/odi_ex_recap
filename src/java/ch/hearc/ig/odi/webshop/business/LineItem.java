package ch.hearc.ig.odi.webshop.business;

/**
 *
 * @author Melissa Voirol <melissa.voirol@he-arc.ch>
 */
public class LineItem {

    private Long id;
    private Integer quantity = 0;
    private Double price = 0.00;
    private Product product;

    public LineItem(Long id, Integer quantity, Double price, Product product) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
