public class Computer
{
    private String hersteller;
    private String modell;
    private boolean laptop;
    private int preis;
    private int mhz;
    
    
    
    public Computer(String hersteller, String modell, boolean laptop, int preis, int mhz)
    {
        setHersteller(hersteller);
        setModell(modell);
        setLaptop(laptop);
        setPreis(preis);
        setMhz(mhz);
    }
    
    public Computer(String hersteller, boolean laptop, int preis, int mhz)
    {
        setHersteller(hersteller);
        setLaptop(laptop);
        setPreis(preis);
        setMhz(mhz);
        setModell("L-14");
    }
    
    
    public Computer(String hersteller, boolean laptop, int preis)
    {
        setHersteller(hersteller);
        setLaptop(laptop);
        setPreis(preis);
        setModell("L-14");
        setMhz(2000);
    }
    
    public Computer(String hersteller, boolean laptop)
    {
        setHersteller(hersteller);
        setLaptop(laptop);
        setPreis(899);
        setModell("L-14");
        setMhz(2000);
        
    }
    
    public Computer(String hersteller, int preis)
    {
        setHersteller(hersteller);
        setPreis(preis);
        setLaptop(true);
        setMhz(2000);
        setModell("L-14");
    }
    
    // Default constructor
    public Computer()
    {
        setHersteller("Lenovo");
        setModell("L-14");
        setLaptop(true);
        setPreis(899);
        setMhz(2000);
    }
    
    
    
    
    
    public void setHersteller(String hersteller)
    {
        this.hersteller = hersteller;
    }
    
    
    public void setModell(String modell)
    {
        this.modell = modell;
    }
    
    public void setLaptop(boolean laptop)
    {
        this.laptop = laptop;
    }
    
    
    public void setPreis(int preis)
    {
        this.preis = preis;
    }
    
    
    public void setMhz(int mhz)
    {
        if((mhz >= 1000) && (mhz <= 4000))
        {
        this.mhz = mhz;
        }
        else
        {
            System.out.println("Fehler: Wert liegt nicht dazwischen!");
            this.mhz = 2000;
        }
        
    }
    
    
    public String getHersteller()
    {
        return hersteller;
    }
    
    public String getModell()
    {
        return modell;
    }
    
    public boolean getLaptop()
    {
        return laptop;
    }
    
    public int getPreis()
    {
        return preis;
    }
    
    
    public int getMhz()
    {
        return mhz;
    }
    
   
   
    public String getKategorie() 
    {
    int pos;
    String kategorie;
    
   

    pos = modell.indexOf("-");  
    kategorie = modell.substring(0, pos);

    return kategorie;
}


public String getDisplay()
{
    int pos;
    String display;
    
    pos = modell.indexOf("-")+1;
    display = modell.substring(pos);
    
    return display;
}
        
        
    
    
    public void printComputer()
    {
     if (laptop == true)
        {
        System.out.println(hersteller + "  " + (laptop) + " - " + 899 + " Euro ");
        }
    else
    {
        System.out.println(hersteller + "  " + (laptop) + " no " + " - " + 899 + " Euro ");
    }
    
    }
    
    
  
    
    
    
    
    
}