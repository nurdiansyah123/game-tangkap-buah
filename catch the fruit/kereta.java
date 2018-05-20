import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kereta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kereta extends benda
{
    /**
     * Act - do whatever the kereta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        {
         moveKereta(); //method moveMonkey
         objectDisappear(); //method objectDisappear
        }
    }    
       
    public void objectDisappear()
    {
         if (canSee(lemon.class)) 
         {
             eat(lemon.class); 
             ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(8); 
             Greenfoot.playSound("score.wav"); 
         }
         if (canSee(pisang.class)) 
         {
             eat(pisang.class); 
<<<<<<< HEAD
             ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(6); 
=======
             ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(12); 
>>>>>>> 3465af44d99824c30567841a26fff9740eb6649d
             Greenfoot.playSound("score.wav"); 
         }
         if (canSee(bom1.class)) 
         {
             Greenfoot.stop();
             gameover1 gover = new gameover1();
             getWorld().addObject(gover, getWorld().getWidth()/2, getWorld().getHeight()/2);
             Greenfoot.playSound("bomb1.wav");
         }
         
    }
       
    public void moveKereta() 
     {
         if (Greenfoot.isKeyDown("left")) 
         {
<<<<<<< HEAD
             move(-11); 
         }
         if (Greenfoot.isKeyDown("right")) 
         {
             move(11); 
=======
             move(-15); 
         }
         if (Greenfoot.isKeyDown("right")) 
         {
             move(15); 
>>>>>>> 3465af44d99824c30567841a26fff9740eb6649d
         }
     }}

