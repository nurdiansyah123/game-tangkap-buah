import greenfoot.*;  

/**
 * Write a description of class bom1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bom1 extends benda
{
    /**
     * Act - do whatever the bom1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer=0;
    public void act() 
    {
        setLocation(getX(), getY()+7); 
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
