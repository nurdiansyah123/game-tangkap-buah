import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mainmenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainmenu extends World
{

    /**
     * Constructor for objects of class mainmenu.
     * 
     */
    public mainmenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(721, 429, 1);
        addObject(new button(), 360, 390);
    }
}
