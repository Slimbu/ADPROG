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

    private float widthInMeters, lengthInMeters, heightInMeters;
    private int numOfColour, numOfCardboard, grade;
    private boolean reinforcedBottom, reinforcedCornor, sealableTop;

    public Cardboard(float newWidth, float newLength, float newHeight, int newnumOfColour, int newNumOfCardboard, int newGrade, boolean newBottom, boolean newCornor, boolean newSealableTop) {

        widthInMeters = newWidth;
        lengthInMeters = newLength;
        heightInMeters = newHeight;
        numOfColour = newnumOfColour;
        numOfCardboard = newNumOfCardboard;
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
        String cardboardLength = String.valueOf(this.lengthInMeters);
        String cardboardWidth = String.valueOf(this.widthInMeters);
        String cardboardHeight = String.valueOf(this.heightInMeters);
        String cardboardColour = String.valueOf(this.numOfColour);

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
        
        double volume = this.calculate(this.lengthInMeters, this.widthInMeters, this.heightInMeters);
        double price = priceOfGradeCardboard(this.grade);
        double costOfCardboard = this.cost(volume, price, this.sealableTop);
        String cardboardQuantity = String.valueOf(this.numOfCardboard);
        double finalPrice = (costOfCardboard * this.numOfCardboard);
        return new String[]{("Length Of Cardboard: " + cardboardLength), ("Width Of Cardbaord: " + cardboardWidth), ("Height Of CardBaord: " + cardboardHeight), ("Grade Of Cardboard: " + cardboardGrade), ("Number Of Colour: " + cardboardColour), reinforcedBottom, reinforcedCornor, sealableTop, ("Quantity: " + cardboardQuantity), "" + finalPrice};
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
