import greenfoot.*;  

/**
 * Write a description of class lemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lemon extends benda
{
    /**
     * Act - do whatever the lemon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer=0;
    public void act() 
    {
        setLocation(getX(), getY()+5); 
        LemonFall(); 
    } 
    
    public void  LemonFall() 
     {
         if (atWorldEdge()) 
         {
             getWorld().removeObject(this); 
             Greenfoot.playSound("lemonfall.wav"); 
         }
     }
}
