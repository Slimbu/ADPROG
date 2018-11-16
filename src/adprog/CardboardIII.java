/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adprog;

/**
 * Type 3 cardboard
 * 
 * @author pc
 */
public class CardboardIII extends NewCardboard {
    
    /**
     * Creates a new Type 3 Pipe
     * @param length
     * @param width
     * @param height
     * @param grade
     * @param sealableTop
     */
    
    public CardboardIII(double length, double width, double height, int grade, boolean sealableTop) {
        super(length, width, height, grade, 2, false, false, sealableTop);
        priceMultiplier = 0.15;
    }
    
}
