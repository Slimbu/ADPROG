/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adprog;

/**
 * Type 4 cardboard
 * 
 * @author pc
 */
public class CardboardTypeIV extends NewCardboard {
    
    /**
     * Creates a new Type 4 Pipe
     * 
     * @param length
     * @param width
     * @param height
     * @param grade
     * @param sealableTop
     */

    public CardboardTypeIV(double length, double width, double height, int grade,boolean sealableTop) {
        super(length, width, height, grade, 2, true, false, sealableTop);
        priceMultiplier = 0.15 + 0.13;
    }
   
}
