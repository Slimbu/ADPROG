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
public abstract class CardboardOrder {

    private NewCardboard orderCardboard;
    private int orderQuantity;
 

    


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
