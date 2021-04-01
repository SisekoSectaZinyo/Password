import org.junit.concurrent.TimeUnit;
import org.junit.jupiter.api.After;
import org.junit.jupiter.api.AfterClass;
import org.junit.jupiter.api.Before;
import org.junit.jupiter.api.BeforeClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertsions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author emileo willemse 219275874
 * 
 */
import static Systems.util*;

public class MiloTests {
    
    private MiloTests student;
    
    private MiloTests studentaccount1;//Gamer 1
    private MiloTests studentaccount2;///Gamer 2
    private MiloTests studentaccount3;//Gamer 3
    
    
    public MiloTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    studentaccount1 = new MiloTests(); 
    studentaccount2 = new MiloTests();
    studentaccount3 = studentaccount1; 
    }
    
    @After
    public void tearDown() {
    
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testEquality (){
    assertEquals(studentaccount1, studentaccount3);
    }
    //testing for equality
    
    @Test
    public void testIdentity (){
    assertSame(studentaccount1, studentaccount3);
    }
    //testing for object identity
    
    @Test
    public void testFail (){
    fail("Failure");
    assertSame(studentaccount2, studentaccount3);
    }//testing for object failing
    
    @Test
    @Timeout(value = 100, unit = TimeUnitMILLISECONDS)
    public void infinity(){
    }
    
    @Test
    public void testDisplayStudentName() {
    }
    
 
}
    

