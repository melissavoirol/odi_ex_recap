package ch.hearc.ig.odi.webshop.presentation.bean;

import ch.hearc.ig.odi.webshop.service.Services;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Melissa Voirol <melissa.voirol@he-arc.ch>
 */
@Named(value = "shoppingCartBean")
@RequestScoped
public class ShoppingCartBean implements Serializable {
    
    @Inject Services services;

    public ShoppingCartBean() {
        
    }
    
    

}
