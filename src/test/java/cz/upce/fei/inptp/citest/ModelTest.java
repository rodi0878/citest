package cz.upce.fei.inptp.citest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ModelTest {
    
    public ModelTest() {
    }
    
    @Test
    public void testRespond() {
        Model m = new Model();
        
        String result = m.respond("test");
        
        assertEquals("Hello test", result);
    }
    
}
