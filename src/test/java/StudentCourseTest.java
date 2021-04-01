/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.Password;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author Ismail_Watara_219018790
 */
public class StudentCourseTest {
    
    
    private StudentCourse studentcourse1;
    private StudentCourse studentcourse2;
    private StudentCourse studentcourse3;
    
    
   @BeforeEach
   public void setUp(){
       studentcourse1 = new StudentCourse();
       studentcourse2 = new StudentCourse();
       studentcourse3 = studentcourse1;
   }
   @Test
   public void testIdentify(){
       assertSame(studentcourse1,studentcourse3);
   }
    //equality
   @Test
   public void testEquality(){
        assertEquals(studentcourse1, studentcourse3);
   }
   //Failing
   @Test
   public void testFail(){
       fail("failure");
       assertEquals(studentcourse1, studentcourse3);
   }
   //timeout
   @Test
   @Timeout (value=200,unit=TimeUnit.MILLISECONDS)
   public void TestTimeout(){
       
   }
   //Dusable
   @Test
   @Disabled("Disabling")
   public void testDisable(){
       System.out.println("Will not run");
   }
   
   
}
   
   
    

