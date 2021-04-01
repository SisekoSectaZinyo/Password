/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author raeesahwilliams
 */
public class RaeTest {
    
    public RaeTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    private static class rae {

        public rae() {
        }
    }

    private static class apple {

        public apple() {
        }
    }

    private static class grape {

        public grape() {
        }
    }
    
    
    public class TestClass {
    
    private rae name;
    private apple P;
    private grape R;

    @BeforeEach
    public void setUpClass(grape grape) {
        name = new rae();
        P = new apple();
        R = grape; 
    }

     
     @Test
     public void objectEquality() {
        assertSame(name, R);
    }
     
     
      @Test
     public void objectIdentity() {
        assertEquals(name, R);
    }
     
      @Test
     public void failingTest() {
         fail("failed test");
        assertEquals(name, R);
    }
     
      @Test
      @Timeout (100)       
      public void timeoutTest() 
        throws InterruptedException {
        while (true) {
            Thread.sleep(400);
    }
      }    
   
      @Test
      @Disabled("Disabled test")      
      public void DisableTest() {
       }
    }
    
    
   
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    
}



