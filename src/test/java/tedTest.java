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
 * @author 219197695 Ted Japhet NZAMBA MABIKA
 */
public class tedTest {
  

    
    
    
    @Before
    public static void setUpClass() {
        name new = name();
        surmane  new = surmane();
        userAccount new = userAccount();
    }
    @Test
    void testName() {
        assertSame(name, surmane, userAccount);
    }
     @Test
    void testSurname() {
        assertEqual(name, surmane, userAccount);
    }
    @Test
    public void testGetUserAccount() {
        System.out.println ("getUserAccount");
        
        
    @Test
    void testEqulity() {
        assertEqual(name, surmane, userAccount);
    }
    
    @Test
    void testIdentity() {
        assertEqual(name, surmane, userAccount);
    }
    
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
