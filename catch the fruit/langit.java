import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class langit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class langit extends World
{

    /**
     * Constructor for objects of class langit.
     * 
     */
    public langit()
    {    
        super(720, 480, 1);
        lemonjatuh();
        pisangjatuh();
        siap(); 
        bomjatuh(); 
        prepare();
    }

    public void act()
    {
        if (getObjects(lemon.class).isEmpty()) lemonjatuh();
        if (getObjects(pisang.class).isEmpty()) pisangjatuh();
        if (getObjects(bom1.class).isEmpty()) bomjatuh();
    }

    private void siap()
    {
        kereta kereta = new kereta();
        addObject(kereta, 648, 403);
        Counter Counter = new Counter();
        addObject(Counter, 57, 69);
        nilai nilai = new nilai();
        addObject(nilai, 64, 44);
        nilai.setLocation(59, 44);
        kereta.setLocation(373, 403);
    }

    public void lemonjatuh() 
    {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new lemon(), Greenfoot.getRandomNumber(519),20);
        }
    }
    
    public void pisangjatuh() 
    {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new pisang(), Greenfoot.getRandomNumber(519),22);
        }
    }

    public void  bomjatuh() 
    {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new bom1(), Greenfoot.getRandomNumber(519),21);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}

