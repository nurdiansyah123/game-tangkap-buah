import greenfoot.*;  

/**
 * Write a description of class bom2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bom2 extends benda
{
    /**
     * Act - do whatever the bom2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer=10;    
    public void act() 
    {
        setLocation(getX(), getY()+10); 
        bom1Fall();
    } 
    
    public void  bom1Fall() 
     {
         if (atWorldEdge()) 
         {
             getWorld().removeObject(this); 
         }
     }
}
