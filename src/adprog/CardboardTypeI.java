/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adprog;

/**
 * Type 1 cardboard
 * 
 * @author pc
 */
public class CardboardTypeI extends NewCardboard {

    /**
     * Creates a new Type 1 Pipe
     * 
     * @param length
     * @param width
     * @param height
     * @param grade
     * @param sealableTop
     */
    
    public CardboardTypeI (double length, double width, double height, int grade, boolean sealableTop) {
        super (length, width, height, grade, 0, false, false, sealableTop);
        priceMultiplier = 0;
    }
}
