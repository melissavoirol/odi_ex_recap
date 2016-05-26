package ch.hearc.ig.odi.webshop.presentation.bean;

import ch.hearc.ig.odi.webshop.business.Product;
import ch.hearc.ig.odi.webshop.service.Services;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Melissa Voirol <melissa.voirol@he-arc.ch>
 */
@Named(value = "productsBean")
@RequestScoped
public class ProductsBean implements Serializable {

    @Inject Services services;

    public ProductsBean() {

    }

    public List<Product> getProducts() {
        return services.getProductsList();
    }

}
