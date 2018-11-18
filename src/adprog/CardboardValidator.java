/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adprog;

/**
 * Object to validate cardboard
 * @author pc
 */
public class CardboardValidator {
    
    /**
     * Creates a new object to validate cardboard
     * 
    */
    public CardboardValidator() {}
    
    
    /**
     * Checks if options make a cardboard of a valid type 
     * @param grade
     * @param colours
     * @param reinforcedButtom
     * @param reinforcedCornor
     * @return type of cardboard as integer
    */
    
    public int check(int grade, int colours, boolean reinforcedButtom, boolean reinforcedCornor) {
        if (reinforcedCornor) {
            if (check5(grade, colours, reinforcedButtom))
                return 5;
        } else if (reinforcedButtom) {
            if (check4(grade, colours))
                return 4;
        } else if (colours == 2) {
            if (grade >= 2 && grade <= 5)
                return 3;
        } else if (colours == 1) {
            if (grade >= 2 && grade <= 4)
                return 2;
        } else if (colours == 0) {
            if (grade >= 1 && grade <= 3)
                return 1;
        }
        return 0;
    }
    
    private boolean check5(int grade, int colours, boolean insulation) {
        if (!insulation)
            return false;
        if (colours != 2)
            return false;
        return (grade >= 3 && grade <= 5);
    } 
    
    private boolean check4(int grade, int colours) {
        if (colours != 2)
            return false;
        return (grade >= 2 && grade <= 5);
    }
    
}
