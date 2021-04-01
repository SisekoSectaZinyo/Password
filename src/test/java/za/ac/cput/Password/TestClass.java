/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.Password;
 
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Disable;
import org.testing.Assert;
import org.testing.annotations.Test;
import org.junit.Timeout;

/**
 *
 * @author Siseko Zinyo
 */
public class TestClass 
{
     int Num1; 
    
     
    @Timeout
     public static void setTimeout(){
     sce.getServletContext().setSessiononTimeout(5);
     }
     
    @BeforeClass
    public static void setUpclass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    
    @Before
    public static void setUp() {
        
    }
    @After
    public static void tearDown() {
        
    }
    
    @Test
    public void testIdentity()
    {
    
    
    }
    
    @Test
    public void testEquality()
    {
        assertSame(Num1);
 
    }
    
    @Test
    public void Disable()
    {
    
    
    }
    
    @Test
    public void TestClassLength()
    {
        PasswordValidator pv = new PasswordValidator();
        Assert.assertEquals (true, pv.isValid("Zinyo41"));
    }
    @Test
    public void TestLength()
    {
  
        Assert.assertEquals (true, PasswordValidator.isValid("222444"));
    }
}
