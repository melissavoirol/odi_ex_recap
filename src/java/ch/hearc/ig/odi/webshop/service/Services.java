package ch.hearc.ig.odi.webshop.service;

import ch.hearc.ig.odi.webshop.business.Product;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Melissa Voirol <melissa.voirol@he-arc.ch>
 */
@SessionScoped
@Stateful
public class Services implements Serializable {

    private HashMap<Long, Product> products;

    public Services() {
        this.products = new HashMap<>();
        try {
            products.put(1l, new Product(1l, "Sécurité informatique", "Introduction et définitions - Méthodologie d'une attaque - Social Engineering - Les failles physiques - Les prises d'empreintes - Les failles réseau - Cloud Computing : forces et faiblesses - Les failles web - Les failles système - Les failles applicatives - Risques juridiques et solutions"));
            products.put(2l, new Product(2l, "Dictionnaire informatique et numérique", "Rédigé par Henri Lilen, l'auteur de livres d'informatique le plus connu en France, voici la nouvelle édition d'un dico très illustré pour connaître tous les mots indispensables dans le domaine du numérique ! 1 400 mots à découvrir absolument."));
            products.put(3l, new Product(3l, "Code Informatique, Fichiers et Libertes", ""));
            products.put(4l, new Product(4l, "Initiation à l'informatique - Windows 8, Word 2013, Excel 2013, Internet Explorer 10 et Outlook 2013", "Ce livre vous présente les bases à connaître pour exploiter efficacement votre ordinateur équipé de Windows 8 et de la suite Microsoft® Office 2013. Il débute par une présentation du nouvel environnement de travail proposé par Windows 8 : comment démarrer votre PC, comment s'y retrouver dans l'interface Windows 8 et l'interface Bureau, comment faire maintenant que le bouton Démarrer a disparu ! "));
        } catch (Exception ex) {
            // Shouldn't happen.
            ex.printStackTrace();
        }
    }

    public List<Product> getProductsList() {
        return new ArrayList(products.values());
    }

}
