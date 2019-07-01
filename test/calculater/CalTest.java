/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculater;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fa14-bse-202
 */
public class CalTest {
    
    public CalTest() {
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

    @Test
    public void add_test() {
        Cal c = new Cal();
        assertEquals(10, c.add(5, 5));

    }

    @Test
    public void sub_test() {

        Cal c = new Cal();
        assertEquals(2, c.sub(5, 3));
    }

    @Test
    public void mul_test() {

        Cal c = new Cal();
        assertEquals(3, c.mul(3, 1));
    }

    @Test
    public void div_test() {

        Cal c = new Cal();
        assertEquals(3, c.div(3, 1));
    }
 @Test
    public void div_test2() {

        Cal c = new Cal();
        assertEquals(3, c.div(4, 1));
    }

    
    
    
}
