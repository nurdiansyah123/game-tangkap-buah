import greenfoot.*;  

/**
 * Write a description of class apel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class apel extends benda
{
    /**
     * Act - do whatever the apel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer=0;
    public void act() 
    {
        setLocation(getX(), getY()+7); 
        apelFall(); 
    } 
    
    public void  apelFall() 
     {
         if (atWorldEdge()) 
         {
             getWorld().removeObject(this); 
             Greenfoot.playSound("lemonfall.wav"); 
         }
     }
}
