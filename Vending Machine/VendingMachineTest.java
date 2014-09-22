

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    @Test
    public void testaddCans()
    {
        VendingMachine test = new VendingMachine(10);
        test.addCans(10);
        assertEquals(20, test.getCans(), 1e-6);
    }
    @Test public void testinsertTokenTokens()
    {
       
        VendingMachine test = new VendingMachine(10);
        test.addCans(10);
        test.insertToken();
        assertEquals(19,test.getCans(),1e-6);
        assertEquals(1,test.getTokens(),1e-6);
    }

}
