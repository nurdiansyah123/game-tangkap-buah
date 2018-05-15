import greenfoot.*; 

/**
 * Write a description of class bom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bom extends benda
{
    
    private final int EAST = 0;
    private final int SOUTH = 30;
    private final int WEST = 60;
    private final int NORTH = 80;
    
    private final int SPEED = 15;
    private int counter = 0;
    
    private int foodEaten = 0;
    
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
    
    private boolean facingEdge() 
{
    switch( getRotation() ) {
        case EAST: return getX()==getWorld().getWidth()-1;
        case SOUTH: return getY()==getWorld().getHeight()-1;
        case WEST: return getX()== 0;
        case NORTH: return getY()== 0;
    }
    return false;
}

private void moveAround()
{
    counter ++;
    if (counter==SPEED) {
        getWorld().addObject( new Tail(foodEaten*SPEED), getX(), getY() );
        move(1);
        counter = 0;
    }
    if (Greenfoot.isKeyDown("right") ) {
        setRotation(EAST);
    }
    if (Greenfoot.isKeyDown("down") ) {
        setRotation(SOUTH);
    }
    if (Greenfoot.isKeyDown("left") ) {
        setRotation(WEST);
    }
    if (Greenfoot.isKeyDown("up") ) {
        setRotation(NORTH);
    }
    }
        
}
