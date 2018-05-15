import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tail extends benda
{
    private int age = 0;
    private int lifeSpan;
    
  public Tail(int lifeSpan)
    {
        GreenfootImage image = new GreenfootImage(20,20);
        image.fill();
        setImage(image);
        
        this.lifeSpan = lifeSpan;
        
    }
    /**
     * Act - do whatever the Tail wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (age == lifeSpan ) {
            getWorld().removeObject(this);
    }    
age++;
}// Add your action code here.    
}
