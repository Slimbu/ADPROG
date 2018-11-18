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
public class OrderCardboardTest {
    
    public OrderCardboardTest() {
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
     * Test of valuesToString method, of class OrderCardboard.
     */
    @Test
    public void testValuesToString() {
        System.out.println("valuesToString");
        OrderCardboard instance = null;
        String expResult = "";
        String result = instance.valuesToString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class OrderCardboard.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        OrderCardboard instance = null;
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class OrderCardboard.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        OrderCardboard instance = null;
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCardboard method, of class OrderCardboard.
     */
    @Test
    public void testSetCardboard() {
        System.out.println("setCardboard");
        NewCardboard cardboard = null;
        OrderCardboard instance = null;
        instance.setCardboard(cardboard);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardboard method, of class OrderCardboard.
     */
    @Test
    public void testGetCardboard() {
        System.out.println("getCardboard");
        OrderCardboard instance = null;
        NewCardboard expResult = null;
        NewCardboard result = instance.getCardboard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardboardPrice method, of class OrderCardboard.
     */
    @Test
    public void testGetCardboardPrice() {
        System.out.println("getCardboardPrice");
        OrderCardboard instance = null;
        double expResult = 0.0;
        double result = instance.getCardboardPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderPrice method, of class OrderCardboard.
     */
    @Test
    public void testGetOrderPrice() {
        System.out.println("getOrderPrice");
        OrderCardboard instance = null;
        double expResult = 0.0;
        double result = instance.getOrderPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
