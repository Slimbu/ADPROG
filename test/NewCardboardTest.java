/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
public class NewCardboardTest {
    
    public NewCardboardTest() {
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
     * Test of getCardboardLength method, of class NewCardboard.
     */
    @Test
    public void testGetCardboardLength() {
        System.out.println("getCardboardLength");
        NewCardboard instance = null;
        double expResult = 0.0;
        double result = instance.getCardboardLength();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardboardWidth method, of class NewCardboard.
     */
    @Test
    public void testGetCardboardWidth() {
        System.out.println("getCardboardWidth");
        NewCardboard instance = null;
        double expResult = 0.0;
        double result = instance.getCardboardWidth();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardboardHeight method, of class NewCardboard.
     */
    @Test
    public void testGetCardboardHeight() {
        System.out.println("getCardboardHeight");
        NewCardboard instance = null;
        double expResult = 0.0;
        double result = instance.getCardboardHeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardboardGrade method, of class NewCardboard.
     */
    @Test
    public void testGetCardboardGrade() {
        System.out.println("getCardboardGrade");
        NewCardboard instance = null;
        int expResult = 0;
        int result = instance.getCardboardGrade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardboardColour method, of class NewCardboard.
     */
    @Test
    public void testGetCardboardColour() {
        System.out.println("getCardboardColour");
        NewCardboard instance = null;
        int expResult = 0;
        int result = instance.getCardboardColour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCardboardReinforcedBottom method, of class NewCardboard.
     */
    @Test
    public void testIsCardboardReinforcedBottom() {
        System.out.println("isCardboardReinforcedBottom");
        NewCardboard instance = null;
        boolean expResult = false;
        boolean result = instance.isCardboardReinforcedBottom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCardboardReinforcedCornor method, of class NewCardboard.
     */
    @Test
    public void testIsCardboardReinforcedCornor() {
        System.out.println("isCardboardReinforcedCornor");
        NewCardboard instance = null;
        boolean expResult = false;
        boolean result = instance.isCardboardReinforcedCornor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCardboardSealableTop method, of class NewCardboard.
     */
    @Test
    public void testIsCardboardSealableTop() {
        System.out.println("isCardboardSealableTop");
        NewCardboard instance = null;
        boolean expResult = false;
        boolean result = instance.isCardboardSealableTop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class NewCardboard.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        NewCardboard instance = null;
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class NewCardboardImpl extends NewCardboard {

        public NewCardboardImpl() {
            super(0.0, 0.0, 0.0, 0, 0, false, false, false);
        }
    }
    
}
