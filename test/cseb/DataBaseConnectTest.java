/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cseb;

import java.sql.Connection;
import junit.framework.TestCase;

/**
 *
 * @author Alok
 */
public class DataBaseConnectTest extends TestCase {
    
    public DataBaseConnectTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of dbConnect method, of class DataBaseConnect.
     */
    public void testDbConnect() {
        System.out.println("dbConnect");
        DataBaseConnect instance = new DataBaseConnect();
        Connection expResult = null;
        Connection result = instance.dbConnect();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DBInsert method, of class DataBaseConnect.
     */
    public void testDBInsert() {
        System.out.println("DBInsert");
        String query = "";
        DataBaseConnect instance = new DataBaseConnect();
        int expResult = 0;
        int result = instance.DBInsert(query);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
