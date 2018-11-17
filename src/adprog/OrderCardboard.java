/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adprog;

import java.text.DecimalFormat;

/**
 * Order containing a cardboard and quantity
 *
 * @author pc
 */
public class OrderCardboard {

    private NewCardboard orderCardboard;
    private int orderedQuantity;

    /**
     * Creates a new order, containing a pipe and a quantity
     *
     * @param cardboard
     * @param quantity
     */
    public OrderCardboard(NewCardboard cardboard, int quantity) {
        orderCardboard = cardboard;
        orderedQuantity = quantity;
    }

    /**
     *
     * @return string with cardboard details
     */
    public String valuesToString() {
        
        String str;
        String cost = new DecimalFormat("0.00").format(getOrderPrice());
        String options = "";

        if (orderCardboard.isCardboardReinforcedBottom()) {
            options += "Reinforced Bottom, ";
        }
        if (orderCardboard.isCardboardReinforcedCornor()) {
            options += "Reinforced Cornor, ";
        }
        if (orderCardboard.isCardboardSealableTop()) {
            options += "Sealable Top, ";
        }
        if (options.isEmpty()) {
            options = "None, ";
        }

        str = "Cardboard Grade: " + orderCardboard.getCardboardGrade() + " \nLength: " + orderCardboard.getCardboardLength() + " Width: " + orderCardboard.getCardboardWidth()
                + " Height: " + orderCardboard.getCardboardHeight() + " Colour: " + orderCardboard.getCardboardColour() + " Options: " + options
                + " Qantity: " + orderedQuantity + " Cost: £" + cost;
        return str;
    }

    /**
     * Sets quantity
     *
     * @param quantity
     */
    public void setQuantity(int quantity) {
        orderedQuantity = quantity;
    }

    /**
     *
     * @return quantity
     */
    public int getQuantity() {
        return orderedQuantity;
    }

    /**
     * sets a new cardboard
     *
     * @return cardboard
     */
    public void setCardboard(NewCardboard cardboard) {
        orderCardboard = cardboard;
    }

    /**
     *
     * @return cardboard
     */
    public NewCardboard getCardboard() {
        return orderCardboard;
    }

    /**
     *
     * @return price of cardboard
     */
    public double getCardboardPrice() {
        return orderCardboard.getPrice();
    }

    /**
     *
     * @return price of entire order
     */
    public double getOrderPrice() {
        double x = orderCardboard.getPrice() * orderedQuantity;
        return (x);
    }
}
