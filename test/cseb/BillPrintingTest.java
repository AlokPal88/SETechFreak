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
public class BillPrintingTest extends TestCase {
    
    public BillPrintingTest(String testName) {
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
     * Test of reportsPrint method, of class BillPrinting.
     */
    public void testReportsPrint() {
        System.out.println("reportsPrint");
        BillPrinting instance = new BillPrinting();
        instance.reportsPrint();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of establishConnection method, of class BillPrinting.
     */
    public void testEstablishConnection() {
        System.out.println("establishConnection");
        Connection expResult = null;
        Connection result = BillPrinting.establishConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
