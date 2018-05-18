import greenfoot.*;  

/**
 * Write a description of class pisang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pisang extends benda
{
    /**
     * Act - do whatever the pisang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer=0;
    public void act() 
    {
        setLocation(getX(), getY()+7); 
        pisangFall(); 
    } 
    
    public void  pisangFall() 
     {
         if (atWorldEdge()) 
         {
             getWorld().removeObject(this); 
             Greenfoot.playSound("lemonfall.wav"); 
         }
     }
}
