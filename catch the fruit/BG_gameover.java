import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BG_gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BG_gameover extends World
{

    /**
     * Constructor for objects of class BG_gameover.
     * 
     */
    public BG_gameover()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setPaintOrder(gameover.class);
        addObject(new gameover(),300,200);
        
    }
}
