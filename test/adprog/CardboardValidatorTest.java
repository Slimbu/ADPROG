/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adprog;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class CardboardValidatorTest {
    
    public CardboardValidatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of check method, of class CardboardValidator.
     */
    @Test
    public void testCheck() {
        System.out.println("check");
        int grade = 0;
        int colours = 0;
        boolean reinforcedButtom = false;
        boolean reinforcedCornor = false;
        CardboardValidator instance = new CardboardValidator();
        int expResult = 0;
        int result = instance.check(grade, colours, reinforcedButtom, reinforcedCornor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
