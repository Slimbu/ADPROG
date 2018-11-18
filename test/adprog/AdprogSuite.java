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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author pc
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({adprog.CardboradUITest.class, adprog.CardboardTypeIITest.class, adprog.OrderCardboardTest.class, adprog.ADPROGTest.class, adprog.CardboardTypeIIITest.class, adprog.CardboardTypeIVTest.class, adprog.CardboardValidatorTest.class, adprog.NewCardboardTest.class, adprog.CardboardTypeITest.class, adprog.CardboardTypeVTest.class})
public class AdprogSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
