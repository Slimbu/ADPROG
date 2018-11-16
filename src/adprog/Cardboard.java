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
public abstract class Cardboard {

    private float width, length, height;
    private int colour, type, grade;
    private boolean reinforcedBottom, reinforcedCornor, sealableTop;

    public Cardboard(float newWidth, float newLength, float newHeight, int newColour, int newType, int newGrade, boolean newBottom, boolean newCornor, boolean newSealableTop) {

        width = newWidth;
        length = newLength;
        height = newHeight;
        colour = newColour;
        type = newType;
        grade = newGrade;
        reinforcedBottom = newBottom;
        reinforcedCornor = newCornor;
        sealableTop = newSealableTop;
    }

    public double calculate(float newLength, float newWidth, float newHeight) {

        double volume;
        volume = newLength * newWidth * newHeight;
        return volume;
    }

    public abstract double cost(double volume, double price, boolean sealTop);

    public String[] getCardboardData() {

        String cardboardGrade = String.valueOf(this.grade);
        String cardboardLength = String.valueOf(this.length);
        String cardboardWidth = String.valueOf(this.width);
        String cardboardHeight = String.valueOf(this.height);
        String cardboardColour = String.valueOf(this.colour);

        String reinforcedBottom;
        if (this.reinforcedBottom) {
            reinforcedBottom = "\tReinforced Bottom";
        } else {
            reinforcedBottom = "\tNot Reinforced Bottom";
        }

        String reinforcedCornor;
        if (this.reinforcedCornor) {
            reinforcedCornor = "\tReinforced Cornor";
        } else {
            reinforcedCornor = "\tNot Reinforced Cornor";
        }

        String sealableTop;
        if (this.sealableTop) {
            sealableTop = "\tSealable Top";
        } else {
            sealableTop = "\tNot Sealable Top";
        }
        
        double volume = this.calculate(this.length, this.width, this.height);
        double price = priceOfGradeCardboard(this.grade);
        double costOfCardboard = this.cost(volume, price, this.sealableTop);
        String cardboardQuantity = String.valueOf(this.type);
        double finalPrice = (costOfCardboard * this.type);
        return new String[]{("Grade Of Cardboard: " + grade), ("Length Of Cardboard: " + length), ("Width Of Cardbaord: " + width), ("Height Of CardBaord: " + height), ("Number Of Colour: " + colour), reinforcedBottom, reinforcedCornor, sealableTop, ("Quantity: " + cardboardQuantity), "" + finalPrice};
    }


    public double priceOfGradeCardboard(int grade) {
        switch (grade) {

            case 1:
                return 0.55;
            case 2:
                return 0.65;
            case 3:
                return 0.82;
            case 4:
                return 0.98;
            case 5:
                return 1.5;
            default:
                return 0;
        }
    }
}
