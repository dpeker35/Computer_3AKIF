
public class TestComputerSemi
{
    public void testMhzOk()
    {
        Computer mhz1;
        mhz1 = new Computer("Lenovo",true,500,1000);
        
        System.out.println(mhz1.getMhz());
        
    }
    
    public void testMhzZuNiedrig()
    {
        Computer mhz2;
        mhz2 = new Computer ("HP", false, 900, 800);
        
        System.out.println(mhz2.getMhz());
    }
    
    
    public void testMhzZuHoch()
    {
        Computer mhz3;
        mhz3 = new Computer("Asus", true, 1200, 5000);
        
        System.out.println(mhz3.getMhz());
    }
    
    
    
    
    
    
    
    
}
