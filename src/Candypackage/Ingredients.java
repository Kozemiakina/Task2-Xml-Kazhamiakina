//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.01 at 10:15:37 PM MSK 
//


package Candypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ingredients complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ingredients">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ingredient" type="{http://www.example.com/ingredients}ingredientType" maxOccurs="5" minOccurs="4"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ingredients", namespace = "http://www.example.com/ingredients", propOrder = {
    "ingredient"
})
public class Ingredients {

    @XmlElement(required = true)
    protected List<IngredientType> ingredient;

    /**
     * Gets the value of the ingredient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IngredientType }
     * 
     * 
     */
    public List<IngredientType> getIngredient() {
        if (ingredient == null) {
            ingredient = new ArrayList<IngredientType>();
        }
        return this.ingredient;
    }
    public void setIngredient(List<IngredientType> ingredientType) {
        this.ingredient=ingredientType;
    }

    @Override
    public String toString() {
        return "Ingredients{" +
                "ingredient=" + ingredient +
                '}';
    }
}
