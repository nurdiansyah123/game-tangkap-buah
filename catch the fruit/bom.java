import greenfoot.*; 

/**
 * Write a description of class bom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bom extends benda
{
    /**
     * Act - do whatever the bom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setLocation(getX(), getY()+8);
       meledak();
    }    
    
    public void meledak()
    {
         if (canSee(kereta.class))
         {
             Greenfoot.playSound("bomb.wav");
         }
         
         if (atWorldEdge())
         {
             getWorld().removeObject(this);
         }
    }
        
}
