/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adprog;

/**
 *
 * @author pc
 */
public class TypeIV extends Cardboard {

    public TypeIV(float newWidth, float newLength, float newHeight, int newColour, int newType, int newGrade, boolean newBottom, boolean newCornor, boolean newSealableTop) {
        super(newWidth, newLength, newHeight, newColour, newType, newGrade, newBottom, newCornor, newSealableTop);
    }
    
    public double cost(double volume, double price, boolean sealTop) {
        double costOfCardboard = volume * price;
        double extra = 1 + 0.15 + 0.13;
        if (sealTop == true) {
            extra += 0.10;
        }
        return costOfCardboard * extra;
    }
}

