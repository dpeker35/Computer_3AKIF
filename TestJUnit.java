

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//eigenes Beispiel, nicht vom TG
public class TestJUnit
{
    @Test
   public void testMhzOk()
    {
        Computer mhz1;
        mhz1 = new Computer("Lenovo",true,500,1000);
        
        assertEquals(mhz1.getMhz(), 1000);
        
    }
    
    @Test
    public void testMhzZuNiedrig()
    {
        Computer mhz2;
        mhz2 = new Computer ("HP", false, 900, 800);
        
        assertEquals(mhz2.getMhz(), 2000);
    }
    
    @Test
    public void testMhzZuHoch()
    {
     
        Computer mhz3;
        mhz3 = new Computer("Asus", true, 1200, 5000);
        
        assertEquals(mhz3.getMhz(), 2000);
    }
    
}
