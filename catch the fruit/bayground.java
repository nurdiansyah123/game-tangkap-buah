import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bayground1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bayground extends World
{

    /**
     * Constructor for objects of class bayground1.
     * 
     */
    public bayground()
    {    
        super(849, 541, 1);
        lemonjatuh();
        pisangjatuh();
        apeljatuh();
        siap(); 
        bomjatuh();
        bomjatuh2();
        prepare();
    }

    public void act()
    {
        if (getObjects(lemon.class).isEmpty()) lemonjatuh();
        if (getObjects(pisang.class).isEmpty()) pisangjatuh();
        if (getObjects(apel.class).isEmpty()) apeljatuh();
        if (getObjects(bom1.class).isEmpty()) bomjatuh();
        if (getObjects(bom2.class).isEmpty()) bomjatuh2();
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
        kereta.setLocation(373, 510);
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
    
    public void apeljatuh() 
    {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new apel(), Greenfoot.getRandomNumber(519),23);
        }
    }

    public void  bomjatuh() 
    {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new bom1(), Greenfoot.getRandomNumber(519),21);
        }
    }
    
    public void  bomjatuh2() 
    {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new bom2(), Greenfoot.getRandomNumber(519),24);
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

